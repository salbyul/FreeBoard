<script setup>
import {useRouter} from "vue-router/dist/vue-router";
import {inject, ref} from "vue";
import {loginMember} from "../api/member";

const router = useRouter();
const userId = ref('');
const password = ref('');
const $cookies = inject('$cookies');

const fetchLogin = async () => {
  if (userId.value.length > 0 && password.value.length > 0) {
    const user = {
      userId: userId.value,
      password: password.value
    }
    try {
      const data = await loginMember(user)
      console.log(data)
      $cookies.set('token', data.body.token, '30min', '', '', true);
      // TODO: 홈으로 이동 후 헤더 새로고침 안된다.
      await router.push({
        name: 'home'
      })
    } catch (error) {
      console.log(error)
      const data = error.response.data;
      if (data.error.code === '100') {
        alert('아이디나 비밀번호가 틀렸습니다.');
      } else {
        alert('서버 에러');
      }
    }
  } else {
    alert('아이디와 비밀번호를 입력해주세요.')
  }
}
</script>

<template>
  <div>
    <div class="mb-10">
      <h1 class="text-center text-3xl">로그인</h1>
    </div>

    <!--    인풋-->
    <div class="mb-5">
      <input type="text" class="border pl-2 w-3/12 text-sm py-1 block mx-auto mb-2" placeholder="아이디" v-model="userId">
      <input type="password" class="border pl-2 w-3/12 text-sm py-1 block mx-auto" placeholder="비밀번호"
             v-model="password">
    </div>

    <!--    버튼-->
    <div>
      <button
          class="block mx-auto mb-1 py-1.5 w-3/12 border text-sm rounded-sm duration-300 hover:duration-300 hover:bg-gray-100"
          @click="fetchLogin">
        로그인
      </button>

      <button
          class="block mx-auto mb-1 py-1.5 w-3/12 border bg-gray-100 text-sm rounded-sm duration-300 hover:duration-300 hover:bg-gray-200"
          @click="() => router.push({name: 'join'})">
        회원가입
      </button>

    </div>
  </div>
</template>
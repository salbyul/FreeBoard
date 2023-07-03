<script setup>

import {onBeforeMount, ref} from "vue";
import {joinMember, validateDuplicateUserId} from "../api/member";
import {validateForJoin, user, validatorInit, validateUserId} from "../composables/useMemberValidator";
import {useRouter} from "vue-router/dist/vue-router";

const isDuplication = ref(null);
const router = useRouter();

const fetchValidateDuplicateUserId = async () => {
  if (validateUserId(user.value.userId)) {
    try {
      await validateDuplicateUserId(user.value.userId);
      isDuplication.value = false;
      alert('사용할 수 있는 아이디입니다.');
    } catch (error) {
      const code = error.response.data.error.code;
      if (code === '119') {
        isDuplication.value = true;
        alert("아이디가 중복됩니다.");
      } else {
        alert('서버 에러');
      }
    }
  }
}

const fetchJoin = async () => {
  if (isDuplication.value !== null && !isDuplication.value) {
    if (validateForJoin()) {
      try {
        await joinMember(user.value);
        alert('회원가입되었습니다.');
        await router.push({
          name: 'login'
        })
      } catch (error) {
        alert('서버 에러');
      }
    }
  } else {
    alert('아이디 중복확인을 해주세요.');
  }
}

const initIsDuplication = () => {
  isDuplication.value = null;
}

onBeforeMount(() => {
  validatorInit();
})
</script>

<template>
  <div>
    <div class="mb-10">
      <h1 class="text-center text-3xl">회원가입</h1>
    </div>

    <!--    인풋-->
    <div class="mb-5">
      <div class="w-4/12 mx-auto mb-2">
        <input type="text" class="border pl-2 text-sm py-1 w-8/12 mr-6" placeholder="아이디" v-model="user.userId"
               @change="initIsDuplication">
        <button
            class="border py-1 text-sm w-3/12 bg-gray-50 rounded-sm duration-300 hover:duration-300 hover:bg-gray-200"
            @click="fetchValidateDuplicateUserId">
          중복확인
        </button>
      </div>
      <input type="password" class="border pl-2 w-4/12 text-sm py-1 block mx-auto mb-2" placeholder="비밀번호"
             v-model="user.password">
      <input type="password" class="border pl-2 w-4/12 text-sm py-1 block mx-auto mb-2" placeholder="비밀번호 확인"
             v-model="user.passwordCheck">
      <input type="text" class="border pl-2 w-4/12 text-sm py-1 block mx-auto mb-2" placeholder="이름"
             v-model="user.name">
    </div>

    <!--    버튼-->
    <div>
      <button
          class="block mx-auto mb-1 w-4/12 py-1.5 border bg-gray-50 text-sm rounded-sm duration-300 hover:duration-300 hover:bg-gray-200"
          @click="fetchJoin">
        회원가입 하기
      </button>
    </div>
  </div>
</template>
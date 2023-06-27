<script setup>
import {useRouter} from "vue-router/dist/vue-router";

const router = useRouter();
</script>

<template>
  <div>
    <div class="mb-10">
      <h1 class="text-center text-3xl">로그인</h1>
    </div>

    <!--    인풋-->
    <div class="mb-5">
      <input type="text" class="border pl-2 w-3/12 text-sm py-1 block mx-auto mb-2" placeholder="아이디">
      <input type="password" class="border pl-2 w-3/12 text-sm py-1 block mx-auto" placeholder="비밀번호">
    </div>

    <!--    버튼-->
    <div>
      <button
          class="block mx-auto mb-1 py-1.5 w-3/12 border text-sm rounded-sm duration-300 hover:duration-300 hover:bg-gray-100">
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
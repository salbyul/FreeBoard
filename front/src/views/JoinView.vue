<script setup>
</script>

<template>
  <div>
    <div class="mb-10">
      <h1 class="text-center text-3xl">회원가입</h1>
    </div>

    <!--    인풋-->
    <div class="mb-5">
      <div class="w-4/12 mx-auto mb-2">
      <input type="text" class="border pl-2 text-sm py-1 w-8/12 mr-6" placeholder="아이디">
        <button class="border py-1 text-sm w-3/12 bg-gray-50 rounded-sm duration-300 hover:duration-300 hover:bg-gray-100">중복확인</button>
      </div>
      <input type="password" class="border pl-2 w-4/12 text-sm py-1 block mx-auto mb-2" placeholder="비밀번호">
      <input type="password" class="border pl-2 w-4/12 text-sm py-1 block mx-auto mb-2" placeholder="비밀번호 확인">
      <input type="text" class="border pl-2 w-4/12 text-sm py-1 block mx-auto mb-2" placeholder="이름">
    </div>

    <!--    버튼-->
    <div>
      <button class="block mx-auto mb-1 w-4/12 py-1.5 border bg-gray-50 text-sm rounded-sm duration-300 hover:duration-300 hover:bg-gray-200">회원가입 하기</button>
    </div>
  </div>
</template>
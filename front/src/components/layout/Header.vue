<script setup>
</script>

<template>
  <div class="border-b mb-10">
    <div class="w-fit mx-auto mb-10"><a href="/" class="text-4xl text-orange-300">Free Board</a></div>
    <div class="flex justify-between mb-5">
      <div>
        <router-link to="/notice" class="px-3 border-r border-gray-500">공지사항</router-link>
        <router-link to="/free" class="px-3 border-r border-gray-500">자유 게시판</router-link>
        <router-link to="/gallery" class="px-3 border-r border-gray-500">갤러리</router-link>
        <router-link to="/inquiry" class="px-3 border-r border-gray-500">문의 게시판</router-link>
      </div>
      <div>
      <div class="w-60">
        <router-link to="/login" class="px-2">로그인</router-link>
        /
        <router-link to="/join" class="px-2">회원가입</router-link>
      </div>
      <div class="flex justify-between">
        <span>ㅁㅁㅁ님 안녕하세요!</span>
        <button>로그아웃</button>
      </div>
      </div>
    </div>
  </div>
</template>
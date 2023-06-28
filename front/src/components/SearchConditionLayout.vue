<script setup>
</script>

<template>
  <div class="mb-20">
    <div class="border py-1.5 px-1.5 mb-3">
      등록일시
      <input type="date" class="border mx-2 py-1 pl-2"> ~
      <input type="date" class="border mx-2 py-1 pl-2">
      <select class="border mx-2 py-1.5 pl-2 pr-3">
        <option disabled selected>전체 분류</option>
      </select>
      <input type="text" placeholder="제목 or 내용" class="border pl-2 text-sm py-1.5 w-4/12 mx-2">
      <button class="border bg-gray-100 px-3 py-1 duration-300 mx-2 hover:duration-300 hover:bg-gray-200 rounded-sm">
        검색
      </button>
    </div>
    <div class="flex justify-between">
      <div>
        <select class="border mr-1 py-1.5 pl-2 pr-3">
          <option v-for="n in 5" :key="n" value="{{n * 10}}">{{ n * 10 }}</option>
        </select>
        개씩 보기
      </div>
      <div>
        정렬
        <select class="border mx-1 py-1.5 pl-2 pr-3">
          <option value="generationTimestamp">등록 일시</option>
          <option value="category">분류</option>
          <option value="title">제목</option>
          <option value="views">조회수</option>
        </select>
        <select class="border mx-1 py-1.5 pl-2 pr-3">
          <option value="desc">내림차순</option>
          <option value="asc">오름차순</option>
        </select>
      </div>
    </div>
  </div>
</template>
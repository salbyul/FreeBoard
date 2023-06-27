<script setup>
const prop = defineProps(["kind"])
</script>

<template>
  <div>
    <h1 class="text-2xl mb-5">{{ prop.kind }}</h1>
    <div class="flex justify-between border-b border-black pb-3">
      <div>
        <strong class="ml-3 mr-5">TAG</strong>
        <span>제목이 출력됩니다.</span>
      </div>
      <div>
        <span class="mr-3">2019.12.12 15:30</span>
        <span>홍관리</span>
      </div>
    </div>
    <div class="text-end mt-3">
      <span>조회수 : 12</span>
    </div>
  </div>
</template>
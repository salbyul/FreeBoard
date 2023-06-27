<script setup>
import {onBeforeMount, ref} from "vue";

const prop = defineProps(["kind", "card"]);

onBeforeMount(() => {
  const kind = prop.kind;
})
</script>

<template>
  <div class="w-5/12 border-t border-l border-r">
    <div class="flex">
      <div class="text-center w-full font-medium py-1">{{ kind }}</div>
      <div class="w-2/12 text-sm py-1">
        <router-link to="#">더보기+</router-link>
      </div>
    </div>
    <div>
      <table class="w-full">
        <thead class="border-y border-black">
        <tr>
          <th class="py-1">번호</th>
          <th>분류</th>
          <th>제목</th>
        </tr>
        </thead>
        <tbody class="text-center">
        <tr class="border-b">
          <td class="py-1">10</td>
          <td>알림</td>
          <td>공지사항 제목이 출력됩니다.</td>
        </tr>
        <tr class="border-b">
          <td class="py-1">10</td>
          <td>알림</td>
          <td>공지사항 제목이 출력됩니다.</td>
        </tr>
        <tr class="border-b">
          <td class="py-1">10</td>
          <td>알림</td>
          <td>공지사항 제목이 출력됩니다.</td>
        </tr>
        <tr class="border-b">
          <td class="py-1">10</td>
          <td>알림</td>
          <td>공지사항 제목이 출력됩니다.</td>
        </tr>
        <tr class="border-b">
          <td class="py-1">10</td>
          <td>알림</td>
          <td>공지사항 제목이 출력됩니다.</td>
        </tr>
        <tr class="border-b">
          <td class="py-1">10</td>
          <td>알림</td>
          <td>공지사항 제목이 출력됩니다.</td>
        </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>
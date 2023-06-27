<script setup>
import SearchConditionLayOut from "../components/SearchConditionLayOut.vue";
import Pagination from "../components/Pagination.vue";
</script>

<template>
  <div>
    <h1 class="text-2xl mb-5">공지사항</h1>
    <SearchConditionLayOut/>
    <div class="text-center mb-20">
      <table class="mx-auto w-full">
        <thead>
        <tr class="border-t border-b">
          <th class="py-1">번호</th>
          <th>분류</th>
          <th>제목</th>
          <th>조회</th>
          <th>등록일시</th>
          <th>등록자</th>
        </tr>
        </thead>
        <tbody>
        <tr class="border-b bg-gray-100">
          <td></td>
          <td class="py-1">알림</td>
          <td>
            <!--            TODO: 글번호 주입-->
            <router-link :to="`/notice/` + 10">공지사항 제목이 출력됩니다.제목이 출력됩니다. 제목이 출력됩니다.</router-link>
          </td>
          <td>2</td>
          <td>2019.11.25 12:00</td>
          <td>홍관리</td>
        </tr>
        <tr class="border-b">
          <td>9</td>
          <td class="py-1">공지</td>
          <td>공지사항 제목이 출력됩니다.제목이 출력됩니다. 제목이 출력됩니다.</td>
          <td>2</td>
          <td>2019.11.25 12:00</td>
          <td>홍관리</td>
        </tr>
        </tbody>
      </table>
    </div>
    <Pagination/>
  </div>
</template>
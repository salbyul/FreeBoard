<script setup>
import SearchConditionLayout from '../../components/SearchConditionLayout.vue'
import Pagination from "../../components/Pagination.vue";
</script>

<template>
  <div>
    <h1 class="text-2xl mb-5">문의 게시판</h1>
    <SearchConditionLayout/>
    <div class="text-center mb-20">
      <div class="text-end">
        <button class="border px-4 py-1 bg-gray-50 mb-2 rounded-sm">글 등록</button>
      </div>
      <table class="mx-auto w-full">
        <thead>
        <tr class="border-t border-b">
          <th class="py-1">번호</th>
          <th>제목</th>
          <th>조회</th>
          <th>등록일시</th>
          <th>등록자</th>
        </tr>
        </thead>
        <tbody>
        <tr class="border-b bg-gray-100">
          <td>10</td>
          <td>
            <!--            TODO: 글번호 주입-->
            <router-link :to="`/inquiry/` + 10">문의게시판 제목이 출력됩니다.제목이 출력됩니다. 제목이 출력됩니다.(답변완료)</router-link>
          </td>
          <td>2</td>
          <td>2019.11.25 12:00</td>
          <td class="py-1">홍길동</td>
        </tr>
        <tr class="border-b">
          <td>9</td>
          <td>자유게시판 제목이 출력됩니다.제목이 출력됩니다. 제목이 출력됩니다.</td>
          <td>2</td>
          <td>2019.11.25 12:00</td>
          <td class="py-1">홍길동</td>
        </tr>
        </tbody>
      </table>
    </div>
    <Pagination/>
  </div>
</template>
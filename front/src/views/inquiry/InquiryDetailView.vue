<script setup>
import BoardHead from '../../components/BoardHead.vue'
</script>

<template>
  <div>
    <BoardHead kind="inquiry"/>
    <div class="mb-10">
      <div class="border p-3 mb-4">강사 게시판 내용이 출력됩니다.강사 게시판 내용이 출력됩니다.강사 게시판 내용이 출력됩니다.강사 게시판 내용이 출력됩니다.강사 게시판 내용이
        출력됩니다.강사
        게시판 내용이 출력됩니다.강사 게시판 내용이 출력됩니다.
      </div>
    </div>
    <div class="bg-gray-50 p-3 mb-10">
      <!--      댓글 목록-->
      <div class="pb-5">
        <div class="flex">
          <div class="w-11/12 mb-2 border-b pb-1">
            <span class="text-sm font-semibold mr-3">홍관리</span>
            <span class="text-xs">2020.03.09 12:13</span>
          </div>
        </div>
        <div class="text-sm">
          댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이
          출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.
        </div>
      </div>
      <div class="text-sm font-semibold text-center py-5">
        아직 등록된 답변이 없습니다.
      </div>
    </div>
    <div class="flex justify-center">
      <button class="border w-1/12 bg-gray-50 mr-5 duration-300 hover:duration-300 hover:bg-gray-100">목록</button>
      <button class="border w-1/12 bg-gray-50 mr-5 duration-300 hover:duration-300 hover:bg-gray-100">수정</button>
      <button class="border w-1/12 bg-gray-50 duration-300 hover:duration-300 hover:bg-gray-100">삭제</button>
    </div>
  </div>
</template>
<script setup>
import BoardHead from '../../components/BoardHead.vue'
</script>

<template>
  <div>
    <BoardHead kind="free"/>
    <div class="mb-10">
      <div class="border p-3 mb-4">강사 게시판 내용이 출력됩니다.강사 게시판 내용이 출력됩니다.강사 게시판 내용이 출력됩니다.강사 게시판 내용이 출력됩니다.강사 게시판 내용이 출력됩니다.강사
        게시판 내용이 출력됩니다.강사 게시판 내용이 출력됩니다.
      </div>
      <!--      파일 첨부 섹션-->
      <div>
        <a href="#" class="pl-3 block mb-1">파일 이미지.jpg</a>
        <a href="#" class="pl-3 block mb-1">파일 이미지.jpg</a>
        <a href="#" class="pl-3 block mb-1">파일 이미지.jpg</a>
      </div>
    </div>
    <!--    댓글 섹션-->
    <div class="bg-gray-50 p-3">
      <!--      댓글 인풋-->
      <div class="flex mb-10">
        <textarea placeholder="댓글을 입력해 주세요." class="border pl-2 resize-none w-11/12 mr-2 text-md"></textarea>
        <button class="border w-1/12 py-3">등록</button>
      </div>
      <!--      댓글 목록-->
      <div class="border-b pb-5">
        <div class="flex">
          <div class="w-11/12 mb-2">
            <span class="text-sm font-semibold mr-3">최감사</span>
            <span class="text-xs">2020.03.09 12:13</span>
          </div>
          <div class="w-1/12 text-center">
            <button class="text-sm">삭제</button>
          </div>
        </div>
        <div class="text-sm">
          댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이
          출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.댓글이 출력됩니다.
        </div>
      </div>
    </div>
    <div class="flex justify-center">
      <button class="border w-1/12 bg-gray-50 mr-5 duration-300 hover:duration-300 hover:bg-gray-100">목록</button>
      <button class="border w-1/12 bg-gray-50 mr-5 duration-300 hover:duration-300 hover:bg-gray-100">수정</button>
      <button class="border w-1/12 bg-gray-50 duration-300 hover:duration-300 hover:bg-gray-100">삭제</button>
    </div>
  </div>
</template>
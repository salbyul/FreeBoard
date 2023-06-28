<script setup>
import BoardHead from '../../components/BoardHead.vue'
</script>

<template>
  <div>
    <BoardHead kind="gallery"/>
    <div>
      <!--      사진 섹션-->
      <div class="mb-10">
        사진 섹션
        캐러셀
      </div>
      <!--      내용 섹션-->
      <div class="border p-3 mb-4">강사 게시판 내용이 출력됩니다.강사 게시판 내용이 출력됩니다.강사 게시판 내용이 출력됩니다.강사 게시판 내용이 출력됩니다.강사 게시판 내용이
        출력됩니다.강사
        게시판 내용이 출력됩니다.강사 게시판 내용이 출력됩니다.
      </div>
    </div>
    <!--    버튼 섹션-->
    <div class="flex justify-center">
      <button class="border w-1/12 bg-gray-50 mr-5 duration-300 hover:duration-300 hover:bg-gray-100">목록</button>
      <button class="border w-1/12 bg-gray-50 mr-5 duration-300 hover:duration-300 hover:bg-gray-100">수정</button>
      <button class="border w-1/12 bg-gray-50 duration-300 hover:duration-300 hover:bg-gray-100">삭제</button>
    </div>
  </div>
</template>
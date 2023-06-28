<script setup>
</script>

<template>
  <div>
    <h1 class="text-2xl mb-5">자유게시판</h1>
    <!--    인풋 섹션-->
    <div class="mb-20 border-y">
      <!--      카테고리-->
      <div class="flex border-b">
        <div class="w-3/12 pl-5 bg-gray-100 py-1">분류*</div>
        <div class="w-9/12 pl-3 py-1">
          <select class="border w-4/12">
            <option disabled selected>분류 선택</option>
          </select>
        </div>
      </div>
      <!--      제목-->
      <div class="flex border-b">
        <div class="w-3/12 pl-5 bg-gray-100 py-1">제목*</div>
        <div class="py-1 pl-3 w-9/12">
          <input type="text" placeholder="제목을 입력해 주세요." class="border w-10/12 pl-2">
        </div>
      </div>
      <!--      내용-->
      <div class="flex border-b">
        <div class="w-3/12 pl-5 bg-gray-100 py-28">내용*</div>
        <div class="py-1 pl-3 w-9/12">
          <textarea class="resize-none border w-10/12 py-24"></textarea>
        </div>
      </div>
      <!--      첨부 파일-->
      <div class="flex">
        <div class="w-3/12 pl-5 bg-gray-100 py-16">첨부</div>
        <div class="py-1 pl-3 w-9/12">
          <span class="text-sm">jpg, gif, png zip파일만 파일사이즈 2MB까지 업로드 가능합니다.</span>
          <div class="py-1 mb-1">
            <input type="text" disabled class="border pl-2 w-6/12 bg-white mr-2" value="이미지파일.jpg">
            <button class="border px-3 bg-gray-50"><label for="asdf" class="hover:cursor-pointer">파일 찾기</label></button>
            <input type="file" class="hidden" id="asdf">
          </div>
          <button class="px-2 border">추가</button>
        </div>
      </div>
    </div>
    <!--    버튼 섹션-->
    <div class="flex justify-center">
      <button class="px-4 border mr-5 duration-300 hover:duration-300 hover:bg-gray-100">등록</button>
      <button class="px-4 border bg-gray-50 duration-300 hover:duration-300 hover:bg-gray-200">취소</button>
    </div>
  </div>
</template>
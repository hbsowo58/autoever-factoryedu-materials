<template>
  <header class="app-header">
    <div class="logo-area">
      <!-- <img src="/logo.svg" alt="로고" class="logo" /> -->
      <span class="title">스마트 차량 대시보드</span>
    </div>
    <nav class="nav-area">
      <router-link to="/">대시보드</router-link>
      <router-link to="/alerts">알림 로그</router-link>
    </nav>
  </header>
</template>

<script setup>
// AppHeader: 상단 헤더(로고, 네비게이션 등 공통 UI)
</script>

<style scoped>
.app-header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  background: #2d3a4b;
  color: #fff;
  padding: 0.5rem 2rem;
  height: 60px;
}
.logo-area {
  display: flex;
  align-items: center;
}
.logo {
  width: 36px;
  height: 36px;
  margin-right: 1rem;
}
.title {
  font-size: 1.3rem;
  font-weight: bold;
}
.nav-area a {
  color: #fff;
  margin-left: 1.5rem;
  text-decoration: none;
  font-weight: 500;
}
.nav-area a.router-link-active {
  text-decoration: underline;
}
</style> 
import React from 'react';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
// TODO - import문을 이용하여 react-router-dom 라이브러리의 Link 컴포넌트를 불러옵니다.

const Sidebar = () => {
  return (
    <section className="sidebar">
      {/* TODO : About 메뉴 아이콘과 Mypage 메뉴 아이콘을 작성하고 Link 컴포넌트를 이용하여 경로(path)를 연결합니다. */}
        <i className="far fa-comment-dots">
          <Link to="/">Home</Link>
        </i>
        <i className="far fa-question-circle">
          <Link to="/about">about</Link>
        </i>
        <i className="far fa-user">
          <Link to="/mypage">mypage</Link>
        </i>
    </section>
  );
};

export default Sidebar;

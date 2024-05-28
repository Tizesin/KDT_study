import React from 'react';
import './App.css';
import './global-style.css';
import { BrowserRouter, Routes, Route} from 'react-router-dom';
// TODO - react-router-dom을 설치 후, import 구문을 이용하여 BrowserRouter, Routes, Route 컴포넌트를 불러오세요.

import Sidebar from './Sidebar';
import About from './Pages/About';
import MyPage from './Pages/MyPage';
import Tweets from './Pages/Tweets';
// TODO - import문을 이용하여 MyPage, About 컴포넌트를 불러오세요.

const App = () => {
  return (
    <div>
      <BrowserRouter>
        <div className="App">
          <main>
            <Sidebar />
              <section className="features">
                <Routes>
                  <Route path="/" element={<Tweets />} />
                  <Route path="/mypage" element={<MyPage />} />
                  <Route path="/about" element={<About />} />
                </Routes>
              <Tweets />
            </section>
          </main>
        </div>
      </BrowserRouter>
    </div>
  );
};
// // Home 컴포넌트
// function Tweets() {
//   return <h1>Home</h1>;
// }

// // MyPage 컴포넌트
// function MyPage() {
//   return <h1>MyPage</h1>;
// }

// // Dashboard 컴포넌트
// function About() {
//   return <h1>About</h1>;
// }
// ! 아래 코드는 수정하지 않습니다.
export default App;

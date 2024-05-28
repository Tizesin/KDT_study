import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';

// function App() {
//   const developerQuotes = [
//     "이제 눈물 그쳐 나를 봐요",
//     "우는 그대 더 아름 다워",
//     "내게 이 모습조차 더 남지 않도록",
//     "그냥 고개 돌려요",
//     "그저 미안한 마음뿐이죠",
//     "그댈 위해 해줄 게 없어",
//     "모두 이해할게요, 그댈 아끼는 맘",
//     "그분들도 같을 거란 걸",
//     "한참 동안을 비틀거렸죠",
//     "그댈 사랑했던 그만큼 whoa",
//     "떠나가요, 아주 먼 곳으로",
//     "그대 소식 내게 올 수 없을 그만큼",
//     "다 잊어요, 내겐 마지막이 될",
//     "사람도 모두 다 버려두고 갈게요"
//   ];
//   const currentProverb = developerQuotes[Math.floor(Math.random()*14)];
//   console.log(Math.random())
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           {currentProverb}
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }

export default function App() {
  return(
    <BrowserRouter>
      <div>
        <nav>
          <ul>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/mypage">Mypage</Link>
            </li>
            <li>
              <Link to="/dashboard">Dashboard</Link>
            </li>
          </ul>
        </nav>

        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/mypage" element={<Mypage />} />
          <Route path="/dashboard" element={<Dashboard />} />
        </Routes>

      </div>
    </BrowserRouter>
  );
}

function Home() {
  return <h1>Home</h1>;
}
function Mypage() {
  return <h1>Mypage</h1>;
}
function Dashboard() {
  return <h1>Dashboard</h1>;
}



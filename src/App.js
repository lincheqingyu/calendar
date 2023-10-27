import React from 'react';
import './App.css';
import MemoList from './components/MemoList';
import AddMemo from './components/AddMemo';

function App() {
  return (
      <div className="App">
        <h1>Student Calendar</h1>
        <AddMemo />
        <MemoList />
      </div>
  );
}

export default App;

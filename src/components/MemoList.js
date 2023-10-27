import React, { useState, useEffect } from 'react';
import axios from 'axios';

function MemoList() {
    const [memos, setMemos] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8080/api/memos')
            .then(response => {
                setMemos(response.data);
            });
    }, []);

    return (
        <div>
            <h2>备忘录</h2>
            <ul>
                {memos.map(memo => (
                    <li key={memo.id}>{memo.title}</li>
                ))}
            </ul>
        </div>
    );
}

export default MemoList;

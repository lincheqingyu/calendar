import React, { useState } from 'react';

function AddMemo() {
    const [title, setTitle] = useState('');
    const [content, setContent] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        const newMemo = {
            title: title,
            content: content
        };
        // Post new memo to backend (replace with your backend URL)
        fetch('/api/memos', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(newMemo)
        }).then(() => {
            setTitle('');
            setContent('');
        });
    };

    return (
        <div>
            <h2>Add Memo</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Title:</label>
                    <input
                        type="text"
                        value={title}
                        onChange={(e) => setTitle(e.target.value)}
                    />
                </div>
                <div>
                    <label>Content:</label>
                    <textarea
                        value={content}
                        onChange={(e) => setContent(e.target.value)}
                    />
                </div>
                <button type="submit">Add</button>
            </form>
        </div>
    );
}

export default AddMemo;

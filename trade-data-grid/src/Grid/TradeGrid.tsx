// src/TradeGrid.tsximport React, { useState, useEffect } from 'react';
import { AgGridReact } from 'ag-grid-react';
import 'ag-grid-community/styles/ag-grid.css';
import 'ag-grid-community/styles/ag-theme-alpine.css';
import { useState, useEffect } from 'react';

interface Trade {
    id: number;
    ticker: string;
    price: number;
    quantity: number;
    timestamp: string;
}

const TradeGrid: React.FC = () => {
    const [rowData, setRowData] = useState<Trade[]>([]);

    useEffect(() => {
        fetch('http://localhost:8080/api/trades')
            .then(response => response.json())
            .then(data => setRowData(data));
    }, []);

    const columns = [
        { headerName: "ID", field: "id" },
        { headerName: "Ticker", field: "ticker" },
        { headerName: "Price", field: "price" },
        { headerName: "Quantity", field: "quantity" },
        { headerName: "Timestamp", field: "timestamp" },
    ];

    return (
        <div className="ag-theme-alpine" style={{ height: 600, width: 1000 }}>
            <AgGridReact
                columnDefs={columns}
                rowData={rowData}
                pagination={true}
                paginationPageSize={10}
            />
        </div>
    );
};

export default TradeGrid;

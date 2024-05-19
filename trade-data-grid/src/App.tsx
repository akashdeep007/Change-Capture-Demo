
import './App.css'
import TradeGrid from './Grid/TradeGrid';

const App: React.FC = () => {
  return (
      <div className="App">
          <header className="App-header">
              <h1>Trade Data Grid</h1>
          </header>
          <TradeGrid />
      </div>
  );
};

export default App

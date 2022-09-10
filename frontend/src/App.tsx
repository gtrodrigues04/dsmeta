import Header from './components/Header';
import SalesCard from './components/SalesCard';
import './index.css';
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

export default function App() {
 return (
  <>
    <ToastContainer />
    <Header />
    <main>
      <section id="sales">
        <div className="dsmeta-contrainer">
          <SalesCard />
        </div>
      </section>
    </main>
  </>
 )
}

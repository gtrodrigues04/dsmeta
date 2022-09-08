import Header from './components/Header'
import SalesCard from './components/SalesCard'
import './index.css'

export default function App() {
 return (
  <>
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

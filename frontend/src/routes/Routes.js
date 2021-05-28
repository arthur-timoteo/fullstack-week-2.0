import {BrowserRouter, Switch, Route} from 'react-router-dom';
import CadastrarInvestimento from '../pages/CadastrarInvestimento';
import ListarInvestimento from '../pages/ListarInvestimento';

export default function Routes(){
    return(
        <BrowserRouter>
            <Switch>
                <Route exact path="/" component={ListarInvestimento} />
                <Route exact path="/cadastrar-investimento" component={CadastrarInvestimento} />
                <Route exact path="/listar-investimentos" component={ListarInvestimento} />
            </Switch>
        </BrowserRouter>
    );
}
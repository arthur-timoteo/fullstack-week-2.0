import axios from 'axios';

const API_URL = 'http://localhost:8080';

class InvestimentoService {

    retrieveAllInvestimentos(){
        return axios.get(`${API_URL}/investimentos`);
    }

    deleteInvestimento(codigo){
    return axios.delete(`${API_URL}/investimentos/${codigo}`);
    }

    saveInvestimento(investimento){
    return axios.post(`${API_URL}/investimentos`, investimento);
    }
}

export default new InvestimentoService();
package airbnb.services.implement;

import java.util.List;

import airbnb.exceptions.NotFoundException;
import airbnb.models.entities.Acomodacao;
import airbnb.models.entities.Aventura;
import airbnb.models.entities.Endereco;
import airbnb.models.entities.Experiencia;
import airbnb.models.entities.Item;
import airbnb.models.request.AcomodacaoRequest;
import airbnb.models.request.AventuraRequest;
import airbnb.models.request.ExperienciaRequest;
import airbnb.models.response.AcomodacaoResponse;
import airbnb.models.response.AventuraResponse;
import airbnb.models.response.ExperienciaResponse;
import airbnb.services.interfaces.IItemService;

public class ItemServiceImpl implements IItemService{

    private List<Item> itensList;
    private List<Acomodacao> acomodacoesList;
    private List<Experiencia> experienciasList;
    private List<Aventura> aventurasList;
    private List<Item> itensListEndereco;


    @Override
    public List<Item> filterEndereco(Endereco endereco) {
        for(Item item: itensList){
            if(item.getEndereco() == endereco){
                itensListEndereco.add(item);
                return itensListEndereco;
            }
        }
        throw new NotFoundException("Nenhum item para esse endreço");
    }

    @Override
    public AcomodacaoResponse createAcomodacao(AcomodacaoRequest acomodacaoRequest) {
        this.findAcomodacaoId(acomodacaoRequest.getId_item());
        Acomodacao acomodacao = new Acomodacao();
        acomodacao.setId_item(acomodacaoRequest.getId_item());
        acomodacao.setValor_diaria(acomodacaoRequest.getValor_diaria());
        acomodacao.setMax_pessoas(acomodacaoRequest.getMax_pessoas());
        acomodacao.setEndereco(acomodacaoRequest.getEndereco());
        acomodacao.setLocador(acomodacaoRequest.getLocador()); 
        acomodacao.setDescricao(acomodacaoRequest.getDescricao()); 
        itensList.add(acomodacao);
        acomodacoesList.add(acomodacao);
        return new AcomodacaoResponse(acomodacao.getId_item(), acomodacao.getValor_diaria(), acomodacao.getMax_pessoas(), acomodacao.getEndereco(), acomodacao.getLocador(), acomodacao.getDescricao());
    }

    @Override
    public ExperienciaResponse createExperiencia(ExperienciaRequest experienciaRequest) {
        this.findExperienciaId(experienciaRequest.getId_item());
        Experiencia experiencia = new Experiencia();
        experiencia.setId_item(experienciaRequest.getId_item());
        experiencia.setValor_diaria(experienciaRequest.getValor_diaria());
        experiencia.setMax_pessoas(experienciaRequest.getMax_pessoas());
        experiencia.setEndereco(experienciaRequest.getEndereco());
        experiencia.setLocador(experienciaRequest.getLocador()); 
        experiencia.setDescricao(experienciaRequest.getDescricao()); 
        itensList.add(experiencia);
        experienciasList.add(experiencia);
        return new ExperienciaResponse(experiencia.getId_item(), experiencia.getValor_diaria(), experiencia.getMax_pessoas(), experiencia.getEndereco(), experiencia.getLocador(), experiencia.getDescricao());
    }

    @Override
    public AventuraResponse createAventura(AventuraRequest aventuraRequest) {
        this.findAventuraId(aventuraRequest.getId_item());
        Aventura aventura = new Aventura();
        aventura.setId_item(aventuraRequest.getId_item());
        aventura.setValor_diaria(aventuraRequest.getValor_diaria());
        aventura.setMax_pessoas(aventuraRequest.getMax_pessoas());
        aventura.setEndereco(aventuraRequest.getEndereco());
        aventura.setLocador(aventuraRequest.getLocador()); 
        aventura.setDescricao(aventuraRequest.getDescricao()); 
        itensList.add(aventura);
        aventurasList.add(aventura);
        return new AventuraResponse(aventura.getId_item(), aventura.getValor_diaria(), aventura.getMax_pessoas(), aventura.getEndereco(), aventura.getLocador(), aventura.getDescricao());
    }

    public Acomodacao findAcomodacaoId(int id_acomodacao){
        for (Acomodacao acomodacao: acomodacoesList) {
            if (acomodacao.getId_acomodacao() == id_acomodacao) return acomodacao;
            this.checkItem(acomodacao);
        }
        return null;
    }

    public Experiencia findExperienciaId(int id_experiencia){
        for (Experiencia experiencia: experienciasList) {
            if (experiencia.getId_experiencia() == id_experiencia) return experiencia;
            this.checkItem(experiencia);
        }
        return null;
    }

    public Aventura findAventuraId(int id_aventura){
        for (Aventura aventura: aventurasList) {
            if (aventura.getId_aventura() == id_aventura)  
                return aventura;    
                this.checkItem(aventura);  
        }
        return null;
    }
    
    @Override
    public void checkItem(Item item){
        if (item != null)
            throw new NotFoundException("Item existente");
    }

    @Override
    public void checkNoItem(Item item) {
        if (item == null)
            throw new NotFoundException("Item não encontrado");
    }

    @Override
    public AcomodacaoResponse updateAcomodacao(AcomodacaoRequest acomodacaoRequest, int id_acomodacao) {
        Acomodacao acomodacaoUpdated = this.findAcomodacaoId(id_acomodacao);
        acomodacaoUpdated.setValor_diaria(acomodacaoRequest.getValor_diaria());
        acomodacaoUpdated.setMax_pessoas(acomodacaoRequest.getMax_pessoas());
        acomodacaoUpdated.setEndereco(acomodacaoRequest.getEndereco());
        acomodacaoUpdated.setLocador(acomodacaoRequest.getLocador()); 
        acomodacaoUpdated.setDescricao(acomodacaoRequest.getDescricao()); 
        itensList.set(id_acomodacao, acomodacaoUpdated);
        acomodacoesList.set(id_acomodacao, acomodacaoUpdated);
        return new AcomodacaoResponse(acomodacaoUpdated.getId_item(), acomodacaoUpdated.getValor_diaria(), acomodacaoUpdated.getMax_pessoas(), acomodacaoUpdated.getEndereco(), acomodacaoUpdated.getLocador(), acomodacaoUpdated.getDescricao());
    }

    @Override
    public ExperienciaResponse updateExperiencia(ExperienciaRequest experienciaRequest, int id_experiencia) {
        Experiencia experienciaUpdated = this.findExperienciaId(id_experiencia);
        experienciaUpdated.setValor_diaria(experienciaRequest.getValor_diaria());
        experienciaUpdated.setMax_pessoas(experienciaRequest.getMax_pessoas());
        experienciaUpdated.setEndereco(experienciaRequest.getEndereco());
        experienciaUpdated.setLocador(experienciaRequest.getLocador()); 
        experienciaUpdated.setDescricao(experienciaRequest.getDescricao()); 
        itensList.set(id_experiencia, experienciaUpdated);
        experienciasList.set(id_experiencia, experienciaUpdated);
        return new ExperienciaResponse(experienciaUpdated.getId_item(), experienciaUpdated.getValor_diaria(), experienciaUpdated.getMax_pessoas(), experienciaUpdated.getEndereco(), experienciaUpdated.getLocador(), experienciaUpdated.getDescricao());
    }

    @Override
    public AventuraResponse updateAventura(AventuraRequest aventuraRequest, int id_aventura) {
        Aventura aventuraUpdated = this.findAventuraId(id_aventura);
        aventuraUpdated.setValor_diaria(aventuraRequest.getValor_diaria());
        aventuraUpdated.setMax_pessoas(aventuraRequest.getMax_pessoas());
        aventuraUpdated.setEndereco(aventuraRequest.getEndereco());
        aventuraUpdated.setLocador(aventuraRequest.getLocador()); 
        aventuraUpdated.setDescricao(aventuraRequest.getDescricao()); 
        itensList.set(id_aventura, aventuraUpdated);
        aventurasList.set(id_aventura, aventuraUpdated);
        return new AventuraResponse(aventuraUpdated.getId_item(), aventuraUpdated.getValor_diaria(), aventuraUpdated.getMax_pessoas(), aventuraUpdated.getEndereco(), aventuraUpdated.getLocador(), aventuraUpdated.getDescricao());
    }


    public void deleteItem(int id_item){
        for(Item item: itensList){
            if(item.getId_item() == id_item){
                itensList.remove(item);
            }
        }
        throw new NotFoundException("Esse item já não existe.");
    }

}

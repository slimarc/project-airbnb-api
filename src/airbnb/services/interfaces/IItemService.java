package airbnb.services.interfaces;

import java.util.List;

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

public interface IItemService {

    List<Item> filterEndereco(Endereco endereco);

    AcomodacaoResponse createAcomodacao(AcomodacaoRequest acomodacaoRequest);
    AcomodacaoResponse updateAcomodacao(AcomodacaoResponse acomodacaoRequest, int id_acomodacao);
    Acomodacao findAcomodacaoId(int id_acomodacao);

    ExperienciaResponse createExperiencia(ExperienciaRequest experienciaRequest);
    ExperienciaResponse updateExperiencia(ExperienciaResponse experienciaRequest, int id_experiencia);
    Experiencia findExperienciaId(int id_experiencia);

    AventuraResponse createAventura(AventuraRequest aventuraRequest);
    AventuraResponse updateAventura(AventuraResponse aventuraRequest, int id_aventura);
    Aventura findAventuraId(int id_aventura);

    void checkItem(Item item);
    void checkNoItem(Item item);

    void deleteItem(int id_item);
    
}
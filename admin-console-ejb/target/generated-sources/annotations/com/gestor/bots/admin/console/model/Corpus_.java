package com.gestor.bots.admin.console.model;

import com.gestor.bots.admin.console.model.Regla;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-10T21:17:02")
@StaticMetamodel(Corpus.class)
public class Corpus_ { 

    public static volatile SingularAttribute<Corpus, String> texto;
    public static volatile SingularAttribute<Corpus, Integer> id;
    public static volatile SingularAttribute<Corpus, Regla> regla;
    public static volatile SingularAttribute<Corpus, String> codigoRegla;

}
package com.vaadin.terminal.gwt.client.ui.dd;

import com.google.gwt.core.client.GWT;

public class VAcceptCriterionFactoryImpl extends com.vaadin.terminal.gwt.client.ui.dd.VAcceptCriterionFactory {
  public VAcceptCriterion get(String name) {
    name = name.intern();
    if ("com.vaadin.event.dd.acceptcriteria.SourceIsTarget" == name) return GWT.create(com.vaadin.terminal.gwt.client.ui.dd.VSourceIsTarget.class );
    else if ("com.vaadin.event.dd.acceptcriteria.Not" == name) return GWT.create(com.vaadin.terminal.gwt.client.ui.dd.VNot.class );
    else if ("com.vaadin.event.dd.acceptcriteria.ServerSideCriterion" == name) return GWT.create(com.vaadin.terminal.gwt.client.ui.dd.VServerAccept.class );
    else if ("com.vaadin.event.dd.acceptcriteria.And" == name) return GWT.create(com.vaadin.terminal.gwt.client.ui.dd.VAnd.class );
    else if ("com.vaadin.event.dd.acceptcriteria.TargetDetailIs" == name) return GWT.create(com.vaadin.terminal.gwt.client.ui.dd.VTargetDetailIs.class );
    else if ("com.vaadin.ui.AbstractSelect.TargetItemIs" == name) return GWT.create(com.vaadin.terminal.gwt.client.ui.dd.VIsOverId.class );
    else if ("com.vaadin.event.dd.acceptcriteria.ContainsDataFlavor" == name) return GWT.create(com.vaadin.terminal.gwt.client.ui.dd.VContainsDataFlavor.class );
    else if ("com.vaadin.ui.Tree.TargetInSubtree" == name) return GWT.create(com.vaadin.terminal.gwt.client.ui.dd.VTargetInSubtree.class );
    else if ("com.vaadin.event.dd.acceptcriteria.Or" == name) return GWT.create(com.vaadin.terminal.gwt.client.ui.dd.VOr.class );
    else if ("com.vaadin.ui.AbstractSelect.AcceptItem" == name) return GWT.create(com.vaadin.terminal.gwt.client.ui.dd.VItemIdIs.class );
    else if ("com.vaadin.event.dd.acceptcriteria.AcceptAll" == name) return GWT.create(com.vaadin.terminal.gwt.client.ui.dd.VAcceptAll.class );
    else if ("com.vaadin.event.dd.acceptcriteria.SourceIs" == name) return GWT.create(com.vaadin.terminal.gwt.client.ui.dd.VDragSourceIs.class );
    else if ("com.vaadin.ui.Table.TableDropCriterion" == name) return GWT.create(com.vaadin.terminal.gwt.client.ui.dd.VLazyInitItemIdentifiers.class );
    else if ("com.vaadin.ui.Tree.TreeDropCriterion" == name) return GWT.create(com.vaadin.terminal.gwt.client.ui.dd.VLazyInitItemIdentifiers.class );
    else return null;
  }
}

package com.vaadin.terminal.gwt.client;

import com.google.gwt.core.client.GWT;
import java.util.HashMap;
import com.google.gwt.core.client.RunAsyncCallback;

public class WidgetMapImpl extends com.vaadin.terminal.gwt.client.WidgetMap {
  public Class<? extends Paintable> getImplementationByServerSideClassName(String fullyQualifiedName) {
    fullyQualifiedName = fullyQualifiedName.intern();
    if ( fullyQualifiedName == "com.vaadin.ui.Upload" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VUpload.class); return com.vaadin.terminal.gwt.client.ui.VUpload.class;}
    else if ( fullyQualifiedName == "com.vaadin.addon.touchkit.ui.EmailField" ) { ensureInstantiator(com.vaadin.addon.touchkit.gwt.client.VEmailField.class); return com.vaadin.addon.touchkit.gwt.client.VEmailField.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.ListSelect" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VListSelect.class); return com.vaadin.terminal.gwt.client.ui.VListSelect.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.CheckBox" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VCheckBox.class); return com.vaadin.terminal.gwt.client.ui.VCheckBox.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.OptionGroup" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VOptionGroup.class); return com.vaadin.terminal.gwt.client.ui.VOptionGroup.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.OrderedLayout" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VOrderedLayout.class); return com.vaadin.terminal.gwt.client.ui.VOrderedLayout.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.CustomComponent" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VCustomComponent.class); return com.vaadin.terminal.gwt.client.ui.VCustomComponent.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.HorizontalSplitPanel" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VSplitPanelHorizontal.class); return com.vaadin.terminal.gwt.client.ui.VSplitPanelHorizontal.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.Button" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VButton.class); return com.vaadin.terminal.gwt.client.ui.VButton.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.DragAndDropWrapper" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VDragAndDropWrapper.class); return com.vaadin.terminal.gwt.client.ui.VDragAndDropWrapper.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.HorizontalLayout" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VHorizontalLayout.class); return com.vaadin.terminal.gwt.client.ui.VHorizontalLayout.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.PopupView" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VPopupView.class); return com.vaadin.terminal.gwt.client.ui.VPopupView.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.InlineDateField" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VDateFieldCalendar.class); return com.vaadin.terminal.gwt.client.ui.VDateFieldCalendar.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.Link" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VLink.class); return com.vaadin.terminal.gwt.client.ui.VLink.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.Accordion" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VAccordion.class); return com.vaadin.terminal.gwt.client.ui.VAccordion.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.ComboBox" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VFilterSelect.class); return com.vaadin.terminal.gwt.client.ui.VFilterSelect.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.Window" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VWindow.class); return com.vaadin.terminal.gwt.client.ui.VWindow.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.Form" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VForm.class); return com.vaadin.terminal.gwt.client.ui.VForm.class;}
    else if ( fullyQualifiedName == "com.vaadin.addon.touchkit.ui.Switch" ) { ensureInstantiator(com.vaadin.addon.touchkit.gwt.client.VSwitch.class); return com.vaadin.addon.touchkit.gwt.client.VSwitch.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.CssLayout" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VCssLayout.class); return com.vaadin.terminal.gwt.client.ui.VCssLayout.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.CustomLayout" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VCustomLayout.class); return com.vaadin.terminal.gwt.client.ui.VCustomLayout.class;}
    else if ( fullyQualifiedName == "com.vaadin.addon.touchkit.ui.NavigationBar" ) { ensureInstantiator(com.vaadin.addon.touchkit.gwt.client.VNavigationBar.class); return com.vaadin.addon.touchkit.gwt.client.VNavigationBar.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.Tree" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VTree.class); return com.vaadin.terminal.gwt.client.ui.VTree.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.Embedded" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VEmbedded.class); return com.vaadin.terminal.gwt.client.ui.VEmbedded.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.FormLayout" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VFormLayout.class); return com.vaadin.terminal.gwt.client.ui.VFormLayout.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.TextField" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VTextField.class); return com.vaadin.terminal.gwt.client.ui.VTextField.class;}
    else if ( fullyQualifiedName == "com.vaadin.addon.touchkit.ui.VerticalComponentGroup" ) { ensureInstantiator(com.vaadin.addon.touchkit.gwt.client.VVerticalComponentGroup.class); return com.vaadin.addon.touchkit.gwt.client.VVerticalComponentGroup.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.TabSheet" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VTabsheet.class); return com.vaadin.terminal.gwt.client.ui.VTabsheet.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.TextArea" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VTextArea.class); return com.vaadin.terminal.gwt.client.ui.VTextArea.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.Slider" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VSlider.class); return com.vaadin.terminal.gwt.client.ui.VSlider.class;}
    else if ( fullyQualifiedName == "com.vaadin.addon.touchkit.ui.TabBarView" ) { ensureInstantiator(com.vaadin.addon.touchkit.gwt.client.VTabBar.class); return com.vaadin.addon.touchkit.gwt.client.VTabBar.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.PasswordField" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VPasswordField.class); return com.vaadin.terminal.gwt.client.ui.VPasswordField.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.TwinColSelect" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VTwinColSelect.class); return com.vaadin.terminal.gwt.client.ui.VTwinColSelect.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.AbsoluteLayout" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VAbsoluteLayout.class); return com.vaadin.terminal.gwt.client.ui.VAbsoluteLayout.class;}
    else if ( fullyQualifiedName == "com.vaadin.addon.touchkit.ui.NavigationButton" ) { ensureInstantiator(com.vaadin.addon.touchkit.gwt.client.VNavigationButton.class); return com.vaadin.addon.touchkit.gwt.client.VNavigationButton.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.Table" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VScrollTable.class); return com.vaadin.terminal.gwt.client.ui.VScrollTable.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.NativeButton" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VNativeButton.class); return com.vaadin.terminal.gwt.client.ui.VNativeButton.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.NativeSelect" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VNativeSelect.class); return com.vaadin.terminal.gwt.client.ui.VNativeSelect.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.SplitPanel" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VSplitPanelHorizontal.class); return com.vaadin.terminal.gwt.client.ui.VSplitPanelHorizontal.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.VerticalSplitPanel" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VSplitPanelVertical.class); return com.vaadin.terminal.gwt.client.ui.VSplitPanelVertical.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.Label" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VLabel.class); return com.vaadin.terminal.gwt.client.ui.VLabel.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.UriFragmentUtility" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VUriFragmentUtility.class); return com.vaadin.terminal.gwt.client.ui.VUriFragmentUtility.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.MenuBar" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VMenuBar.class); return com.vaadin.terminal.gwt.client.ui.VMenuBar.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.Select" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VFilterSelect.class); return com.vaadin.terminal.gwt.client.ui.VFilterSelect.class;}
    else if ( fullyQualifiedName == "com.vaadin.addon.touchkit.ui.NavigationView" ) { ensureInstantiator(com.vaadin.addon.touchkit.gwt.client.VNavigationView.class); return com.vaadin.addon.touchkit.gwt.client.VNavigationView.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.DateField" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VPopupCalendar.class); return com.vaadin.terminal.gwt.client.ui.VPopupCalendar.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.Panel" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VPanel.class); return com.vaadin.terminal.gwt.client.ui.VPanel.class;}
    else if ( fullyQualifiedName == "com.vaadin.addon.touchkit.ui.NavigationManager" ) { ensureInstantiator(com.vaadin.addon.touchkit.gwt.client.VNavigationManager.class); return com.vaadin.addon.touchkit.gwt.client.VNavigationManager.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.VerticalLayout" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VVerticalLayout.class); return com.vaadin.terminal.gwt.client.ui.VVerticalLayout.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.ProgressIndicator" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VProgressIndicator.class); return com.vaadin.terminal.gwt.client.ui.VProgressIndicator.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.GridLayout" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.VGridLayout.class); return com.vaadin.terminal.gwt.client.ui.VGridLayout.class;}
    else if ( fullyQualifiedName == "com.vaadin.addon.touchkit.ui.NumberField" ) { ensureInstantiator(com.vaadin.addon.touchkit.gwt.client.VNumberField.class); return com.vaadin.addon.touchkit.gwt.client.VNumberField.class;}
    else if ( fullyQualifiedName == "com.vaadin.addon.touchkit.ui.Popover" ) { ensureInstantiator(com.vaadin.addon.touchkit.gwt.client.VPopover.class); return com.vaadin.addon.touchkit.gwt.client.VPopover.class;}
    else if ( fullyQualifiedName == "com.vaadin.ui.RichTextArea" ) { ensureInstantiator(com.vaadin.terminal.gwt.client.ui.richtextarea.VRichTextArea.class); return com.vaadin.terminal.gwt.client.ui.richtextarea.VRichTextArea.class;}
    else return com.vaadin.terminal.gwt.client.ui.VUnknownComponent.class;
  }
  public void ensureInstantiator(Class<? extends Paintable> classType) {
  if(!instmap.containsKey(classType)){
  if( classType == com.vaadin.terminal.gwt.client.ui.VUpload.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VUpload.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VUpload.class );
  }
  }
  );}});
} else if( classType == com.vaadin.addon.touchkit.gwt.client.VEmailField.class) {instmap.put(com.vaadin.addon.touchkit.gwt.client.VEmailField.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.addon.touchkit.gwt.client.VEmailField.class );
  }
  }
);} else if( classType == com.vaadin.terminal.gwt.client.ui.VListSelect.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VListSelect.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VListSelect.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VCheckBox.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VCheckBox.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VCheckBox.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VOptionGroup.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VOptionGroup.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VOptionGroup.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VOrderedLayout.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VOrderedLayout.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VOrderedLayout.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VCustomComponent.class) {instmap.put(com.vaadin.terminal.gwt.client.ui.VCustomComponent.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VCustomComponent.class );
  }
  }
);} else if( classType == com.vaadin.terminal.gwt.client.ui.VSplitPanelHorizontal.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VSplitPanelHorizontal.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VSplitPanelHorizontal.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VButton.class) {instmap.put(com.vaadin.terminal.gwt.client.ui.VButton.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VButton.class );
  }
  }
);} else if( classType == com.vaadin.terminal.gwt.client.ui.VDragAndDropWrapper.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VDragAndDropWrapper.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VDragAndDropWrapper.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VHorizontalLayout.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VHorizontalLayout.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VHorizontalLayout.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VPopupView.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VPopupView.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VPopupView.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VDateFieldCalendar.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VDateFieldCalendar.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VDateFieldCalendar.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VLink.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VLink.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VLink.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VAccordion.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VAccordion.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VAccordion.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VFilterSelect.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VFilterSelect.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VFilterSelect.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VWindow.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VWindow.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VWindow.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VForm.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VForm.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VForm.class );
  }
  }
  );}});
} else if( classType == com.vaadin.addon.touchkit.gwt.client.VSwitch.class) {instmap.put(com.vaadin.addon.touchkit.gwt.client.VSwitch.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.addon.touchkit.gwt.client.VSwitch.class );
  }
  }
);} else if( classType == com.vaadin.terminal.gwt.client.ui.VCssLayout.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VCssLayout.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VCssLayout.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VCustomLayout.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VCustomLayout.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VCustomLayout.class );
  }
  }
  );}});
} else if( classType == com.vaadin.addon.touchkit.gwt.client.VNavigationBar.class) {instmap.put(com.vaadin.addon.touchkit.gwt.client.VNavigationBar.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.addon.touchkit.gwt.client.VNavigationBar.class );
  }
  }
);} else if( classType == com.vaadin.terminal.gwt.client.ui.VTree.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VTree.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VTree.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VEmbedded.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VEmbedded.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VEmbedded.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VFormLayout.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VFormLayout.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VFormLayout.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VTextField.class) {instmap.put(com.vaadin.terminal.gwt.client.ui.VTextField.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VTextField.class );
  }
  }
);} else if( classType == com.vaadin.addon.touchkit.gwt.client.VVerticalComponentGroup.class) {instmap.put(com.vaadin.addon.touchkit.gwt.client.VVerticalComponentGroup.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.addon.touchkit.gwt.client.VVerticalComponentGroup.class );
  }
  }
);} else if( classType == com.vaadin.terminal.gwt.client.ui.VTabsheet.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VTabsheet.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VTabsheet.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VTextArea.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VTextArea.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VTextArea.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VSlider.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VSlider.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VSlider.class );
  }
  }
  );}});
} else if( classType == com.vaadin.addon.touchkit.gwt.client.VTabBar.class) {instmap.put(com.vaadin.addon.touchkit.gwt.client.VTabBar.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.addon.touchkit.gwt.client.VTabBar.class );
  }
  }
);} else if( classType == com.vaadin.terminal.gwt.client.ui.VPasswordField.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VPasswordField.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VPasswordField.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VTwinColSelect.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VTwinColSelect.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VTwinColSelect.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VAbsoluteLayout.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VAbsoluteLayout.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VAbsoluteLayout.class );
  }
  }
  );}});
} else if( classType == com.vaadin.addon.touchkit.gwt.client.VNavigationButton.class) {instmap.put(com.vaadin.addon.touchkit.gwt.client.VNavigationButton.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.addon.touchkit.gwt.client.VNavigationButton.class );
  }
  }
);} else if( classType == com.vaadin.terminal.gwt.client.ui.VScrollTable.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VScrollTable.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VScrollTable.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VNativeButton.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VNativeButton.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VNativeButton.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VNativeSelect.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VNativeSelect.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VNativeSelect.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VSplitPanelVertical.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VSplitPanelVertical.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VSplitPanelVertical.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VLabel.class) {instmap.put(com.vaadin.terminal.gwt.client.ui.VLabel.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VLabel.class );
  }
  }
);} else if( classType == com.vaadin.terminal.gwt.client.ui.VUriFragmentUtility.class) {instmap.put(com.vaadin.terminal.gwt.client.ui.VUriFragmentUtility.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VUriFragmentUtility.class );
  }
  }
);} else if( classType == com.vaadin.terminal.gwt.client.ui.VMenuBar.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VMenuBar.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VMenuBar.class );
  }
  }
  );}});
} else if( classType == com.vaadin.addon.touchkit.gwt.client.VNavigationView.class) {instmap.put(com.vaadin.addon.touchkit.gwt.client.VNavigationView.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.addon.touchkit.gwt.client.VNavigationView.class );
  }
  }
);} else if( classType == com.vaadin.terminal.gwt.client.ui.VPopupCalendar.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VPopupCalendar.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VPopupCalendar.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VPanel.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VPanel.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VPanel.class );
  }
  }
  );}});
} else if( classType == com.vaadin.addon.touchkit.gwt.client.VNavigationManager.class) {instmap.put(com.vaadin.addon.touchkit.gwt.client.VNavigationManager.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.addon.touchkit.gwt.client.VNavigationManager.class );
  }
  }
);} else if( classType == com.vaadin.terminal.gwt.client.ui.VVerticalLayout.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VVerticalLayout.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VVerticalLayout.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VProgressIndicator.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VProgressIndicator.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VProgressIndicator.class );
  }
  }
  );}});
} else if( classType == com.vaadin.terminal.gwt.client.ui.VGridLayout.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.VGridLayout.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.VGridLayout.class );
  }
  }
  );}});
} else if( classType == com.vaadin.addon.touchkit.gwt.client.VNumberField.class) {instmap.put(com.vaadin.addon.touchkit.gwt.client.VNumberField.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.addon.touchkit.gwt.client.VNumberField.class );
  }
  }
);} else if( classType == com.vaadin.addon.touchkit.gwt.client.VPopover.class) {instmap.put(com.vaadin.addon.touchkit.gwt.client.VPopover.class, new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.addon.touchkit.gwt.client.VPopover.class );
  }
  }
);} else if( classType == com.vaadin.terminal.gwt.client.ui.richtextarea.VRichTextArea.class) {ApplicationConfiguration.startWidgetLoading();
  GWT.runAsync( 
  new WidgetLoader() { void addInstantiator() {instmap.put(com.vaadin.terminal.gwt.client.ui.richtextarea.VRichTextArea.class,new WidgetInstantiator() {
   public Paintable get() {
   return GWT.create(com.vaadin.terminal.gwt.client.ui.richtextarea.VRichTextArea.class );
  }
  }
  );}});
}}
  }
  public Class<? extends Paintable>[] getDeferredLoadedWidgets() {
  return new Class[] {
  com.vaadin.terminal.gwt.client.ui.VListSelect.class,
  com.vaadin.terminal.gwt.client.ui.VCheckBox.class,
  com.vaadin.terminal.gwt.client.ui.VOptionGroup.class,
  com.vaadin.terminal.gwt.client.ui.VDragAndDropWrapper.class,
  com.vaadin.terminal.gwt.client.ui.VDateFieldCalendar.class,
  com.vaadin.terminal.gwt.client.ui.VLink.class,
  com.vaadin.terminal.gwt.client.ui.VForm.class,
  com.vaadin.terminal.gwt.client.ui.VCssLayout.class,
  com.vaadin.terminal.gwt.client.ui.VTree.class,
  com.vaadin.terminal.gwt.client.ui.VEmbedded.class,
  com.vaadin.terminal.gwt.client.ui.VFormLayout.class,
  com.vaadin.terminal.gwt.client.ui.VTextArea.class,
  com.vaadin.terminal.gwt.client.ui.VSlider.class,
  com.vaadin.terminal.gwt.client.ui.VPasswordField.class,
  com.vaadin.terminal.gwt.client.ui.VScrollTable.class,
  com.vaadin.terminal.gwt.client.ui.VNativeButton.class,
  com.vaadin.terminal.gwt.client.ui.VNativeSelect.class,
  com.vaadin.terminal.gwt.client.ui.VPopupCalendar.class,
  com.vaadin.terminal.gwt.client.ui.VProgressIndicator.class};
  }
  public Paintable instantiate(Class<? extends Paintable> classType) {
    Paintable p = super.instantiate(classType); if(p!= null) return p;
    return instmap.get(classType).get();
  }
}

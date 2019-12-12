// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Widgets;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;
import org.bytedeco.qt.Qt5Gui.*;
import static org.bytedeco.qt.global.Qt5Gui.*;

import static org.bytedeco.qt.global.Qt5Widgets.*;

// Parsed from QtWidgets/qaction.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QAction extends QObject {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QAction(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QAction(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QAction position(long position) {
        return (QAction)super.position(position);
    }

    // note this is copied into qplatformmenu.h, which must stay in sync
    /** enum QAction::MenuRole */
    public static final int NoRole = 0, TextHeuristicRole = 1, ApplicationSpecificRole = 2, AboutQtRole = 3,
                    AboutRole = 4, PreferencesRole = 5, QuitRole = 6;
    
    /** enum QAction::Priority */
    public static final int LowPriority = 0,
                    NormalPriority = 128,
                    HighPriority = 256;
    
    public QAction(QObject parent/*=nullptr*/) { super((Pointer)null); allocate(parent); }
    private native void allocate(QObject parent/*=nullptr*/);
    public QAction() { super((Pointer)null); allocate(); }
    private native void allocate();
    public QAction(@Const @ByRef QString text, QObject parent/*=nullptr*/) { super((Pointer)null); allocate(text, parent); }
    private native void allocate(@Const @ByRef QString text, QObject parent/*=nullptr*/);
    public QAction(@Const @ByRef QString text) { super((Pointer)null); allocate(text); }
    private native void allocate(@Const @ByRef QString text);
    public QAction(@Const @ByRef QIcon icon, @Const @ByRef QString text, QObject parent/*=nullptr*/) { super((Pointer)null); allocate(icon, text, parent); }
    private native void allocate(@Const @ByRef QIcon icon, @Const @ByRef QString text, QObject parent/*=nullptr*/);
    public QAction(@Const @ByRef QIcon icon, @Const @ByRef QString text) { super((Pointer)null); allocate(icon, text); }
    private native void allocate(@Const @ByRef QIcon icon, @Const @ByRef QString text);
    public native void setIcon(@Const @ByRef QIcon icon);
    public native @ByVal QIcon icon();

    public native void setText(@Const @ByRef QString text);
    public native @ByVal QString text();

    public native void setIconText(@Const @ByRef QString text);
    public native @ByVal QString iconText();

    public native void setToolTip(@Const @ByRef QString tip);
    public native @ByVal QString toolTip();

    public native void setStatusTip(@Const @ByRef QString statusTip);
    public native @ByVal QString statusTip();

    public native void setWhatsThis(@Const @ByRef QString what);
    public native @ByVal QString whatsThis();

    public native void setPriority(@Cast("QAction::Priority") int priority);
    public native @Cast("QAction::Priority") int priority();

// #if QT_CONFIG(menu)
    public native QMenu menu();
    public native void setMenu(QMenu menu);
// #endif

    public native void setSeparator(@Cast("bool") boolean b);
    public native @Cast("bool") boolean isSeparator();

// #if QT_CONFIG(shortcut)

    public native void setShortcutContext(@Cast("Qt::ShortcutContext") int context);
    public native @Cast("Qt::ShortcutContext") int shortcutContext();

    public native void setAutoRepeat(@Cast("bool") boolean arg0);
    public native @Cast("bool") boolean autoRepeat();
// #endif

    public native void setFont(@Const @ByRef QFont font);
    public native @ByVal QFont font();

    public native void setCheckable(@Cast("bool") boolean arg0);
    public native @Cast("bool") boolean isCheckable();

    public native @ByVal QVariant data();
    public native void setData(@Const @ByRef QVariant var);

    public native @Cast("bool") boolean isChecked();

    public native @Cast("bool") boolean isEnabled();

    public native @Cast("bool") boolean isVisible();

    /** enum QAction::ActionEvent */
    public static final int Trigger = 0, Hover = 1;
    public native void activate(@Cast("QAction::ActionEvent") int event);
    public native @Cast("bool") boolean showStatusText(QWidget widget/*=nullptr*/);
    public native @Cast("bool") boolean showStatusText();

    public native void setMenuRole(@Cast("QAction::MenuRole") int menuRole);
    public native @Cast("QAction::MenuRole") int menuRole();

    public native void setIconVisibleInMenu(@Cast("bool") boolean visible);
    public native @Cast("bool") boolean isIconVisibleInMenu();

    public native void setShortcutVisibleInContextMenu(@Cast("bool") boolean show);
    public native @Cast("bool") boolean isShortcutVisibleInContextMenu();

    public native QWidget parentWidget();
// #if QT_CONFIG(graphicsview)
    public native void trigger();
    public native void hover();
    public native void setChecked(@Cast("bool") boolean arg0);
    public native void toggle();
    public native void setEnabled(@Cast("bool") boolean arg0);
    public native void setDisabled(@Cast("bool") boolean b);
    public native void setVisible(@Cast("bool") boolean arg0);
}

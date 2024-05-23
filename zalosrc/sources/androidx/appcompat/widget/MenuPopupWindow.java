package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C1071d;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.view.menu.C1074g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class MenuPopupWindow extends ListPopupWindow implements InterfaceC1169f1 {

    /* renamed from: Z */
    private static Method f4383Z;

    /* renamed from: Y */
    private InterfaceC1169f1 f4384Y;

    /* loaded from: classes2.dex */
    public static class MenuDropDownListView extends C1228z0 {

        /* renamed from: D */
        final int f4385D;

        /* renamed from: E */
        final int f4386E;

        /* renamed from: F */
        private InterfaceC1169f1 f4387F;

        /* renamed from: G */
        private MenuItem f4388G;

        public MenuDropDownListView(Context context, boolean z11) {
            super(context, z11);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f4385D = 21;
                this.f4386E = 22;
            } else {
                this.f4385D = 22;
                this.f4386E = 21;
            }
        }

        @Override // androidx.appcompat.widget.C1228z0
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo5326d(int i11, int i12, int i13, int i14, int i15) {
            return super.mo5326d(i11, i12, i13, i14, i15);
        }

        @Override // androidx.appcompat.widget.C1228z0
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo5327e(MotionEvent motionEvent, int i11) {
            return super.mo5327e(motionEvent, i11);
        }

        @Override // androidx.appcompat.widget.C1228z0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.C1228z0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.C1228z0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.C1228z0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.C1228z0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            C1071d c1071d;
            int i11;
            C1074g c1074g;
            int pointToPosition;
            int i12;
            if (this.f4387F != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i11 = headerViewListAdapter.getHeadersCount();
                    c1071d = (C1071d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c1071d = (C1071d) adapter;
                    i11 = 0;
                }
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i12 = pointToPosition - i11) >= 0 && i12 < c1071d.getCount()) {
                    c1074g = c1071d.getItem(i12);
                } else {
                    c1074g = null;
                }
                MenuItem menuItem = this.f4388G;
                if (menuItem != c1074g) {
                    C1072e m5036b = c1071d.m5036b();
                    if (menuItem != null) {
                        this.f4387F.mo5027o(m5036b, menuItem);
                    }
                    this.f4388G = c1074g;
                    if (c1074g != null) {
                        this.f4387F.mo5026e(m5036b, c1074g);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i11, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i11 == this.f4385D) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && i11 == this.f4386E) {
                setSelection(-1);
                ((C1071d) getAdapter()).m5036b().m5080e(false);
                return true;
            }
            return super.onKeyDown(i11, keyEvent);
        }

        @Override // androidx.appcompat.widget.C1228z0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC1169f1 interfaceC1169f1) {
            this.f4387F = interfaceC1169f1;
        }

        @Override // androidx.appcompat.widget.C1228z0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f4383Z = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
    }

    /* renamed from: R */
    public void m5322R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f4364U.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: S */
    public void m5323S(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f4364U.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: T */
    public void m5324T(InterfaceC1169f1 interfaceC1169f1) {
        this.f4384Y = interfaceC1169f1;
    }

    /* renamed from: U */
    public void m5325U(boolean z11) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f4364U.setTouchModal(z11);
            return;
        }
        Method method = f4383Z;
        if (method != null) {
            try {
                method.invoke(this.f4364U, Boolean.valueOf(z11));
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1169f1
    /* renamed from: e */
    public void mo5026e(C1072e c1072e, MenuItem menuItem) {
        InterfaceC1169f1 interfaceC1169f1 = this.f4384Y;
        if (interfaceC1169f1 != null) {
            interfaceC1169f1.mo5026e(c1072e, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1169f1
    /* renamed from: o */
    public void mo5027o(C1072e c1072e, MenuItem menuItem) {
        InterfaceC1169f1 interfaceC1169f1 = this.f4384Y;
        if (interfaceC1169f1 != null) {
            interfaceC1169f1.mo5027o(c1072e, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    /* renamed from: s */
    C1228z0 mo5315s(Context context, boolean z11) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z11);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}

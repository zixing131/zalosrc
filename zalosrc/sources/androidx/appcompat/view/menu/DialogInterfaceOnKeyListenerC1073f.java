package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC1051a;
import androidx.appcompat.view.menu.InterfaceC1077j;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import p175g0.AbstractC19184g;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes2.dex */
class DialogInterfaceOnKeyListenerC1073f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC1077j.a {

    /* renamed from: p */
    private C1072e f4040p;

    /* renamed from: q */
    private DialogInterfaceC1051a f4041q;

    /* renamed from: r */
    C1070c f4042r;

    /* renamed from: s */
    private InterfaceC1077j.a f4043s;

    public DialogInterfaceOnKeyListenerC1073f(C1072e c1072e) {
        this.f4040p = c1072e;
    }

    /* renamed from: a */
    public void m5099a() {
        DialogInterfaceC1051a dialogInterfaceC1051a = this.f4041q;
        if (dialogInterfaceC1051a != null) {
            dialogInterfaceC1051a.dismiss();
        }
    }

    /* renamed from: b */
    public void m5100b(IBinder iBinder) {
        C1072e c1072e = this.f4040p;
        DialogInterfaceC1051a.a aVar = new DialogInterfaceC1051a.a(c1072e.m5095w());
        C1070c c1070c = new C1070c(aVar.m4870b(), AbstractC19184g.abc_list_menu_item_layout);
        this.f4042r = c1070c;
        c1070c.mo4993h(this);
        this.f4040p.m5074b(this.f4042r);
        aVar.m4871c(this.f4042r.m5029a(), this);
        View m5049A = c1072e.m5049A();
        if (m5049A != null) {
            aVar.m4872d(m5049A);
        } else {
            aVar.m4873e(c1072e.m5097y()).m4876h(c1072e.m5098z());
        }
        aVar.m4874f(this);
        DialogInterfaceC1051a m4869a = aVar.m4869a();
        this.f4041q = m4869a;
        m4869a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f4041q.getWindow().getAttributes();
        attributes.type = ZAbstractBase.ZVU_BLEND_GEN_THUMB;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f4041q.show();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j.a
    /* renamed from: c */
    public void mo4850c(C1072e c1072e, boolean z11) {
        if (z11 || c1072e == this.f4040p) {
            m5099a();
        }
        InterfaceC1077j.a aVar = this.f4043s;
        if (aVar != null) {
            aVar.mo4850c(c1072e, z11);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j.a
    /* renamed from: d */
    public boolean mo4851d(C1072e c1072e) {
        InterfaceC1077j.a aVar = this.f4043s;
        if (aVar != null) {
            return aVar.mo4851d(c1072e);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i11) {
        this.f4040p.m5061N((C1074g) this.f4042r.m5029a().getItem(i11), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f4042r.mo4988c(this.f4040p, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i11 == 82 || i11 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f4041q.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f4041q.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f4040p.m5080e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f4040p.performShortcut(i11, keyEvent, 0);
    }
}

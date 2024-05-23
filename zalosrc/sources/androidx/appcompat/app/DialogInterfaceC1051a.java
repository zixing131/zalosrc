package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p175g0.AbstractC19178a;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes2.dex */
public class DialogInterfaceC1051a extends AbstractDialogC1060j implements DialogInterface {

    /* renamed from: r */
    final AlertController f3836r;

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private final AlertController.C1030f f3837a;

        /* renamed from: b */
        private final int f3838b;

        public a(Context context) {
            this(context, DialogInterfaceC1051a.m4867g(context, 0));
        }

        /* renamed from: a */
        public DialogInterfaceC1051a m4869a() {
            DialogInterfaceC1051a dialogInterfaceC1051a = new DialogInterfaceC1051a(this.f3837a.f3699a, this.f3838b);
            this.f3837a.m4738a(dialogInterfaceC1051a.f3836r);
            dialogInterfaceC1051a.setCancelable(this.f3837a.f3716r);
            if (this.f3837a.f3716r) {
                dialogInterfaceC1051a.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC1051a.setOnCancelListener(this.f3837a.f3717s);
            dialogInterfaceC1051a.setOnDismissListener(this.f3837a.f3718t);
            DialogInterface.OnKeyListener onKeyListener = this.f3837a.f3719u;
            if (onKeyListener != null) {
                dialogInterfaceC1051a.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC1051a;
        }

        /* renamed from: b */
        public Context m4870b() {
            return this.f3837a.f3699a;
        }

        /* renamed from: c */
        public a m4871c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C1030f c1030f = this.f3837a;
            c1030f.f3721w = listAdapter;
            c1030f.f3722x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public a m4872d(View view) {
            this.f3837a.f3705g = view;
            return this;
        }

        /* renamed from: e */
        public a m4873e(Drawable drawable) {
            this.f3837a.f3702d = drawable;
            return this;
        }

        /* renamed from: f */
        public a m4874f(DialogInterface.OnKeyListener onKeyListener) {
            this.f3837a.f3719u = onKeyListener;
            return this;
        }

        /* renamed from: g */
        public a m4875g(ListAdapter listAdapter, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.C1030f c1030f = this.f3837a;
            c1030f.f3721w = listAdapter;
            c1030f.f3722x = onClickListener;
            c1030f.f3692I = i11;
            c1030f.f3691H = true;
            return this;
        }

        /* renamed from: h */
        public a m4876h(CharSequence charSequence) {
            this.f3837a.f3704f = charSequence;
            return this;
        }

        public a(Context context, int i11) {
            this.f3837a = new AlertController.C1030f(new ContextThemeWrapper(context, DialogInterfaceC1051a.m4867g(context, i11)));
            this.f3838b = i11;
        }
    }

    protected DialogInterfaceC1051a(Context context, int i11) {
        super(context, m4867g(context, i11));
        this.f3836r = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: g */
    static int m4867g(Context context, int i11) {
        if (((i11 >>> 24) & 255) >= 1) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC19178a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView m4868e() {
        return this.f3836r.m4722d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AbstractDialogC1060j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3836r.m4723e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (this.f3836r.m4724g(i11, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (this.f3836r.m4725h(i11, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // androidx.appcompat.app.AbstractDialogC1060j, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f3836r.m4731q(charSequence);
    }
}

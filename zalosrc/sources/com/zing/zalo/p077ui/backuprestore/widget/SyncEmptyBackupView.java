package com.zing.zalo.p077ui.backuprestore.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.backuprestore.widget.SyncEmptyBackupView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p649xl.C29967od;
import p649xl.C29985pd;

/* loaded from: classes5.dex */
public final class SyncEmptyBackupView extends LinearLayout {

    /* renamed from: t */
    public static final C11145b f56123t = new C11145b(null);

    /* renamed from: p */
    private C29967od f56124p;

    /* renamed from: q */
    private C29985pd f56125q;

    /* renamed from: r */
    private InterfaceC11144a f56126r;

    /* renamed from: s */
    private int f56127s;

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.SyncEmptyBackupView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11144a {

        /* renamed from: com.zing.zalo.ui.backuprestore.widget.SyncEmptyBackupView$a$a */
        /* loaded from: classes5.dex */
        public static final class a {
            /* renamed from: a */
            public static void m58402a(InterfaceC11144a interfaceC11144a) {
            }
        }

        /* renamed from: kx */
        void mo57320kx();

        /* renamed from: p0 */
        void mo57325p0();
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.SyncEmptyBackupView$b */
    /* loaded from: classes5.dex */
    public static final class C11145b {
        private C11145b() {
        }

        public /* synthetic */ C11145b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncEmptyBackupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        m58400h(context);
    }

    /* renamed from: d */
    private final void m58396d(Context context) {
        C29967od m148337b = C29967od.m148337b(LayoutInflater.from(context), this);
        AbstractC19074t.m100207e(m148337b, "inflate(...)");
        this.f56124p = m148337b;
        if (m148337b == null) {
            AbstractC19074t.m100223u("binding");
            m148337b = null;
        }
        m148337b.f138903q.setOnClickListener(new View.OnClickListener() { // from class: d50.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SyncEmptyBackupView.m58397e(SyncEmptyBackupView.this, view);
            }
        });
        m58401c(this.f56127s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m58397e(SyncEmptyBackupView syncEmptyBackupView, View view) {
        AbstractC19074t.m100208f(syncEmptyBackupView, "this$0");
        InterfaceC11144a interfaceC11144a = syncEmptyBackupView.f56126r;
        if (interfaceC11144a != null) {
            interfaceC11144a.mo57325p0();
        }
    }

    /* renamed from: f */
    private final void m58398f(Context context) {
        C29985pd m148377b = C29985pd.m148377b(LayoutInflater.from(context), this);
        AbstractC19074t.m100207e(m148377b, "inflate(...)");
        this.f56125q = m148377b;
        C29985pd c29985pd = null;
        if (m148377b == null) {
            AbstractC19074t.m100223u("bindingViewUserCloud");
            m148377b = null;
        }
        m148377b.f139030r.setOnClickListener(new View.OnClickListener() { // from class: d50.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SyncEmptyBackupView.m58399g(SyncEmptyBackupView.this, view);
            }
        });
        C29985pd c29985pd2 = this.f56125q;
        if (c29985pd2 == null) {
            AbstractC19074t.m100223u("bindingViewUserCloud");
        } else {
            c29985pd = c29985pd2;
        }
        c29985pd.f139031s.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m58399g(SyncEmptyBackupView syncEmptyBackupView, View view) {
        AbstractC19074t.m100208f(syncEmptyBackupView, "this$0");
        InterfaceC11144a interfaceC11144a = syncEmptyBackupView.f56126r;
        if (interfaceC11144a != null) {
            interfaceC11144a.mo57320kx();
        }
    }

    /* renamed from: h */
    private final void m58400h(Context context) {
        setClickable(true);
        setFocusable(true);
        setBackgroundColor(C23212s8.m119607o(context, AbstractC2807a.surface_background_alt));
        setOrientation(1);
        if (!AbstractC3489d.m17501i() && !AbstractC3489d.m17512t()) {
            m58396d(context);
        } else {
            m58398f(context);
        }
    }

    /* renamed from: c */
    public final void m58401c(int i11) {
        if (!AbstractC3489d.m17501i() && !AbstractC3489d.m17512t()) {
            C29967od c29967od = null;
            if (i11 != 0) {
                if (i11 == 1) {
                    C29967od c29967od2 = this.f56124p;
                    if (c29967od2 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29967od2 = null;
                    }
                    c29967od2.f138907u.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_empty_title_2));
                    C29967od c29967od3 = this.f56124p;
                    if (c29967od3 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29967od3 = null;
                    }
                    c29967od3.f138904r.setVisibility(8);
                    C29967od c29967od4 = this.f56124p;
                    if (c29967od4 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29967od4 = null;
                    }
                    c29967od4.f138905s.setVisibility(8);
                    C29967od c29967od5 = this.f56124p;
                    if (c29967od5 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29967od = c29967od5;
                    }
                    c29967od.f138906t.setVisibility(0);
                    return;
                }
                return;
            }
            C29967od c29967od6 = this.f56124p;
            if (c29967od6 == null) {
                AbstractC19074t.m100223u("binding");
                c29967od6 = null;
            }
            c29967od6.f138907u.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_msg_empty_title));
            C29967od c29967od7 = this.f56124p;
            if (c29967od7 == null) {
                AbstractC19074t.m100223u("binding");
                c29967od7 = null;
            }
            c29967od7.f138904r.setVisibility(0);
            C29967od c29967od8 = this.f56124p;
            if (c29967od8 == null) {
                AbstractC19074t.m100223u("binding");
                c29967od8 = null;
            }
            c29967od8.f138905s.setVisibility(0);
            C29967od c29967od9 = this.f56124p;
            if (c29967od9 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29967od = c29967od9;
            }
            c29967od.f138906t.setVisibility(8);
        }
    }

    public final InterfaceC11144a getOnEmptyBackupViewListener() {
        return this.f56126r;
    }

    public final int getTypeLayout() {
        return this.f56127s;
    }

    public final void setOnEmptyBackupViewListener(InterfaceC11144a interfaceC11144a) {
        this.f56126r = interfaceC11144a;
    }

    public final void setTypeLayout(int i11) {
        this.f56127s = i11;
    }
}

package com.zing.zalo.p077ui.backuprestore.widget;

import android.content.Context;
import android.util.AttributeSet;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p525ti.C26701b;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes5.dex */
public final class SyncBackupInfoV2View extends ModulesView {

    /* renamed from: K */
    private C16716d f56099K;

    /* renamed from: L */
    private C16716d f56100L;

    /* renamed from: M */
    private C22126c0 f56101M;

    /* renamed from: N */
    private C22126c0 f56102N;

    /* renamed from: O */
    private C22126c0 f56103O;

    /* renamed from: P */
    private C22126c0 f56104P;

    /* renamed from: Q */
    private final InterfaceC24854k f56105Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncBackupInfoV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        m129210a = AbstractC24856m.m129210a(new C11152a(this));
        this.f56105Q = m129210a;
        m58383W(context);
    }

    /* renamed from: W */
    private final void m58383W(Context context) {
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.m89106L().m89028L(-2, -2);
        c22126c0.mo111964L1(AbstractC23222t7.f112584s);
        c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_02));
        c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.backup_info_title_messsage));
        this.f56101M = c22126c0;
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.m89106L().m89028L(-2, -2);
        c22126c02.mo111964L1(AbstractC23222t7.f112584s);
        c22126c02.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_02));
        c22126c02.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.backingup_database_device_info));
        this.f56103O = c22126c02;
        this.f56099K = new C16716d(context);
        C22126c0 c22126c03 = new C22126c0(context);
        C16718f m89034R = c22126c03.m89106L().m89028L(-2, -2).m89034R(AbstractC23222t7.f112556e);
        C22126c0 c22126c04 = this.f56101M;
        C16716d c16716d = null;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("titleBackupInfoTime");
            c22126c04 = null;
        }
        m89034R.m89054h0(c22126c04);
        c22126c03.mo111964L1(AbstractC23222t7.f112584s);
        c22126c03.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_01));
        this.f56102N = c22126c03;
        C16716d c16716d2 = this.f56099K;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("groupBackupInfoTime");
            c16716d2 = null;
        }
        C22126c0 c22126c05 = this.f56101M;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("titleBackupInfoTime");
            c22126c05 = null;
        }
        c16716d2.m89001g1(c22126c05);
        C16716d c16716d3 = this.f56099K;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("groupBackupInfoTime");
            c16716d3 = null;
        }
        C22126c0 c22126c06 = this.f56102N;
        if (c22126c06 == null) {
            AbstractC19074t.m100223u("contentBackupInfoTime");
            c22126c06 = null;
        }
        c16716d3.m89001g1(c22126c06);
        C16716d c16716d4 = new C16716d(context);
        C16718f m89106L = c16716d4.m89106L();
        C16716d c16716d5 = this.f56099K;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("groupBackupInfoTime");
            c16716d5 = null;
        }
        m89106L.m89066s(c16716d5);
        c16716d4.m89106L().m89033Q(AbstractC23222t7.f112556e);
        this.f56100L = c16716d4;
        C22126c0 c22126c07 = new C22126c0(context);
        C16718f m89028L = c22126c07.m89106L().m89028L(-2, -2);
        C22126c0 c22126c08 = this.f56103O;
        if (c22126c08 == null) {
            AbstractC19074t.m100223u("titleBackupInfoDevice");
            c22126c08 = null;
        }
        m89028L.m89054h0(c22126c08).m89034R(AbstractC23222t7.f112556e);
        c22126c07.mo111964L1(AbstractC23222t7.f112584s);
        c22126c07.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_01));
        this.f56104P = c22126c07;
        C16716d c16716d6 = this.f56100L;
        if (c16716d6 == null) {
            AbstractC19074t.m100223u("groupBackupInfoDevice");
            c16716d6 = null;
        }
        C22126c0 c22126c09 = this.f56103O;
        if (c22126c09 == null) {
            AbstractC19074t.m100223u("titleBackupInfoDevice");
            c22126c09 = null;
        }
        c16716d6.m89001g1(c22126c09);
        C16716d c16716d7 = this.f56100L;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("groupBackupInfoDevice");
            c16716d7 = null;
        }
        C22126c0 c22126c010 = this.f56104P;
        if (c22126c010 == null) {
            AbstractC19074t.m100223u("contentBackupInfoDevice");
            c22126c010 = null;
        }
        c16716d7.m89001g1(c22126c010);
        C16716d c16716d8 = this.f56099K;
        if (c16716d8 == null) {
            AbstractC19074t.m100223u("groupBackupInfoTime");
            c16716d8 = null;
        }
        mo69681L(c16716d8);
        C16716d c16716d9 = this.f56100L;
        if (c16716d9 == null) {
            AbstractC19074t.m100223u("groupBackupInfoDevice");
        } else {
            c16716d = c16716d9;
        }
        mo69681L(c16716d);
    }

    private final int getTextColor2() {
        return ((Number) this.f56105Q.getValue()).intValue();
    }

    /* renamed from: V */
    public final void m58384V(C26701b c26701b) {
        if (c26701b != null) {
            C22126c0 c22126c0 = this.f56102N;
            C22126c0 c22126c02 = null;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("contentBackupInfoTime");
                c22126c0 = null;
            }
            c22126c0.m111959G1(c26701b.m137267c());
            C22126c0 c22126c03 = this.f56104P;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("contentBackupInfoDevice");
            } else {
                c22126c02 = c22126c03;
            }
            c22126c02.m111959G1(c26701b.m137266b());
        }
    }

    public final void setTextSizeContentInfoDevice(float f11) {
        C22126c0 c22126c0 = this.f56104P;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("contentBackupInfoDevice");
            c22126c0 = null;
        }
        c22126c0.mo111964L1(f11);
    }

    public final void setTextSizeContentInfoTime(float f11) {
        C22126c0 c22126c0 = this.f56102N;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("contentBackupInfoTime");
            c22126c0 = null;
        }
        c22126c0.mo111964L1(f11);
    }

    public final void setTextSizeTitleInfoDevice(float f11) {
        C22126c0 c22126c0 = this.f56103O;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("titleBackupInfoDevice");
            c22126c0 = null;
        }
        c22126c0.mo111964L1(f11);
    }

    public final void setTextSizeTitleInfoTime(float f11) {
        C22126c0 c22126c0 = this.f56101M;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("titleBackupInfoTime");
            c22126c0 = null;
        }
        c22126c0.mo111964L1(f11);
    }

    public final void setTitleColor(int i11) {
        C22126c0 c22126c0 = this.f56101M;
        C22126c0 c22126c02 = null;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("titleBackupInfoTime");
            c22126c0 = null;
        }
        c22126c0.m111962J1(i11);
        C22126c0 c22126c03 = this.f56103O;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("titleBackupInfoDevice");
        } else {
            c22126c02 = c22126c03;
        }
        c22126c02.m111962J1(i11);
    }
}

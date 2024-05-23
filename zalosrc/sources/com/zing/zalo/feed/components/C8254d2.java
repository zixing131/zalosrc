package com.zing.zalo.feed.components;

import android.content.Context;
import ao.InterfaceC2259a;
import bo.C3000l0;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import p354n3.C23528a;

/* renamed from: com.zing.zalo.feed.components.d2 */
/* loaded from: classes4.dex */
public class C8254d2 extends C16716d implements InterfaceC8427w6 {

    /* renamed from: M0 */
    private C8364q2 f45306M0;

    /* renamed from: N0 */
    private C8299i2 f45307N0;

    /* renamed from: O0 */
    private int f45308O0;

    /* renamed from: P0 */
    private final C23528a f45309P0;

    /* renamed from: Q0 */
    private InterfaceC2259a f45310Q0;

    public C8254d2(Context context) {
        super(context);
        this.f45309P0 = new C23528a(context);
    }

    /* renamed from: p1 */
    private void m44650p1(Context context, boolean z11) {
        C8299i2 c8299i2 = new C8299i2(context);
        this.f45307N0 = c8299i2;
        c8299i2.m44725v1(context, z11);
        this.f45307N0.m44724F1(this);
        m89001g1(this.f45307N0);
    }

    /* renamed from: q1 */
    private void m44651q1(Context context, boolean z11) {
        C8364q2 c8364q2 = new C8364q2(context);
        this.f45306M0 = c8364q2;
        c8364q2.m44849x1(context, z11, this.f45308O0);
        this.f45306M0.m44844N1(this);
        m89001g1(this.f45306M0);
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8427w6
    /* renamed from: M2 */
    public void mo43802M2(C3000l0 c3000l0) {
        InterfaceC2259a interfaceC2259a;
        if (c3000l0 != null && (interfaceC2259a = this.f45310Q0) != null) {
            interfaceC2259a.mo11925M2(c3000l0);
        }
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8427w6
    /* renamed from: X */
    public void mo43803X(C3000l0 c3000l0) {
        InterfaceC2259a interfaceC2259a;
        if (c3000l0 != null && (interfaceC2259a = this.f45310Q0) != null) {
            interfaceC2259a.mo11940X(c3000l0);
        }
    }

    /* renamed from: o1 */
    public void m44652o1(Context context, int i11, boolean z11) {
        this.f45308O0 = i11;
        if (i11 != 0 && i11 != 13) {
            if (i11 == 2 || i11 == 3) {
                m44650p1(context, z11);
                return;
            }
            return;
        }
        m44651q1(context, z11);
    }

    /* renamed from: r1 */
    public void m44653r1() {
        C8364q2 c8364q2 = this.f45306M0;
        if (c8364q2 != null) {
            c8364q2.m44840E1();
        }
        C8299i2 c8299i2 = this.f45307N0;
        if (c8299i2 != null) {
            c8299i2.m44726z1();
        }
    }

    /* renamed from: s1 */
    public void m44654s1() {
        C8364q2 c8364q2 = this.f45306M0;
        if (c8364q2 != null) {
            c8364q2.m44841F1();
        }
        C8299i2 c8299i2 = this.f45307N0;
        if (c8299i2 != null) {
            c8299i2.m44721A1();
        }
    }

    /* renamed from: t1 */
    public void m44655t1(C3000l0 c3000l0) {
        C8364q2 c8364q2 = this.f45306M0;
        if (c8364q2 != null) {
            c8364q2.m44842L1(c3000l0);
        }
        C8299i2 c8299i2 = this.f45307N0;
        if (c8299i2 != null) {
            c8299i2.m44722D1(c3000l0);
        }
    }

    /* renamed from: u1 */
    public void m44656u1(InterfaceC2259a interfaceC2259a) {
        this.f45310Q0 = interfaceC2259a;
    }

    /* renamed from: v1 */
    public void m44657v1(int i11, boolean z11) {
        C8299i2 c8299i2;
        int i12 = this.f45308O0;
        if (i12 != 0 && i12 != 13) {
            if ((i12 == 2 || i12 == 3) && (c8299i2 = this.f45307N0) != null) {
                c8299i2.m44723E1(i11, this.f45309P0, z11);
                return;
            }
            return;
        }
        C8364q2 c8364q2 = this.f45306M0;
        if (c8364q2 != null) {
            c8364q2.m44843M1(i11, this.f45309P0, z11);
        }
    }

    /* renamed from: w1 */
    public void m44658w1(int i11, Context context, InterfaceC10867f interfaceC10867f, boolean z11) {
        C8364q2 c8364q2;
        int i12 = this.f45308O0;
        if ((i12 == 0 || i12 == 13) && (c8364q2 = this.f45306M0) != null) {
            c8364q2.m44845O1(i11, context, this.f45309P0, this.f45310Q0, interfaceC10867f, z11);
        }
    }

    /* renamed from: x1 */
    public void m44659x1(C16719g.c cVar) {
        C8364q2 c8364q2;
        int i11 = this.f45308O0;
        if ((i11 == 0 || i11 == 13) && (c8364q2 = this.f45306M0) != null) {
            c8364q2.m44846P1(cVar);
        }
    }

    /* renamed from: y1 */
    public void m44660y1(C16719g.c cVar) {
        C8364q2 c8364q2;
        int i11 = this.f45308O0;
        if ((i11 == 0 || i11 == 13) && (c8364q2 = this.f45306M0) != null) {
            c8364q2.m44847Q1(cVar);
        }
    }
}

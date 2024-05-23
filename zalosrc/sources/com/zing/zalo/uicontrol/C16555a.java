package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zdesign.component.avatar.AbstractC16946b;
import com.zing.zalo.zdesign.component.avatar.C16948d;
import ei0.InterfaceC18436a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p348mi.C23302b;
import vg.AbstractRunnableC28185s6;
import vg.C28203u6;

/* renamed from: com.zing.zalo.uicontrol.a */
/* loaded from: classes4.dex */
public final class C16555a implements InterfaceC18436a, AbstractRunnableC28185s6.b {

    /* renamed from: p */
    private Object f83629p;

    /* renamed from: com.zing.zalo.uicontrol.a$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractRunnableC28185s6 {

        /* renamed from: A */
        final /* synthetic */ InterfaceC18509p f83630A;

        /* renamed from: B */
        final /* synthetic */ List f83631B;

        /* renamed from: z */
        final /* synthetic */ List f83632z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C16555a c16555a, List list, InterfaceC18509p interfaceC18509p, List list2) {
            super(c16555a, list, 1054);
            this.f83632z = list;
            this.f83630A = interfaceC18509p;
            this.f83631B = list2;
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "profiles");
            try {
                this.f83630A.mo240pC(this.f83632z, this.f83631B);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // ei0.InterfaceC18436a
    /* renamed from: a */
    public boolean mo88230a(String str) {
        AbstractC19074t.m100208f(str, "avt");
        return C23302b.f113247a.m120523d(str);
    }

    @Override // ei0.InterfaceC18436a
    /* renamed from: b */
    public AbstractC16946b mo88231b(Context context, AbstractC16946b.a aVar, Drawable.Callback callback) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "listener");
        AbstractC19074t.m100208f(callback, "drawableCallback");
        return new C16559b(context, aVar, callback);
    }

    @Override // ei0.InterfaceC18436a
    /* renamed from: c */
    public C16948d mo88232c(String str, boolean z11) {
        String substring;
        AbstractC19074t.m100208f(str, "uid");
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, str, false, 2, null);
        if (m141800i == null) {
            return null;
        }
        String m40418n0 = m141800i.m40418n0();
        if (m40418n0.length() >= 2) {
            if (z11) {
                AbstractC19074t.m100205c(m40418n0);
                substring = m40418n0.substring(0, 1);
                AbstractC19074t.m100207e(substring, "substring(...)");
            } else {
                AbstractC19074t.m100205c(m40418n0);
                substring = m40418n0.substring(0, 2);
                AbstractC19074t.m100207e(substring, "substring(...)");
            }
            m40418n0 = substring;
        }
        return new C16948d(3, m141800i.f42434r, m40418n0, m141800i.f42446v);
    }

    @Override // ei0.InterfaceC18436a
    /* renamed from: d */
    public void mo88233d(List list, List list2, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(list, "profileUids");
        AbstractC19074t.m100208f(list2, "profileIndices");
        AbstractC19074t.m100208f(interfaceC18509p, "onProfilesLoadedFunc");
        new a(this, list, interfaceC18509p, list2).m141750b();
    }

    @Override // vg.AbstractRunnableC28185s6.b
    public Object getTag(int i11) {
        return this.f83629p;
    }

    @Override // vg.AbstractRunnableC28185s6.b
    public void setTag(int i11, Object obj) {
        this.f83629p = obj;
    }
}

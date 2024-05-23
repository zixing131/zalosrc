package p716zh;

import ae.C0766k;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.List;
import p639xb.AbstractC29570c;

/* renamed from: zh.l1 */
/* loaded from: classes.dex */
public class C31999l1 extends AbstractC29570c {

    /* renamed from: zh.l1$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ List f147241a;

        a(List list) {
            this.f147241a = list;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            if (c20096c != null) {
                i11 = c20096c.m104491c();
            } else {
                i11 = -1;
            }
            C31999l1.this.m154262c(i11);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C31999l1.this.m154263d(this.f147241a);
        }
    }

    @Override // p639xb.AbstractC29570c
    /* renamed from: a */
    public void mo146954a(List list) {
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(list));
            c0766k.mo1778x9(list);
        } catch (Exception e11) {
            e11.printStackTrace();
            m154262c(-1);
        }
    }

    /* renamed from: c */
    void m154262c(int i11) {
        AbstractC29570c.a aVar = this.f136483a;
        if (aVar != null) {
            aVar.mo144404b(i11);
        }
    }

    /* renamed from: d */
    void m154263d(List list) {
        AbstractC29570c.a aVar = this.f136483a;
        if (aVar != null) {
            aVar.mo144403a(list);
        }
    }
}

package c30;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import gn.C19515b;
import gn.C19516c;
import hm0.C20096c;
import java.util.ArrayList;
import p038bl.C2834f;
import p588vw.C28644j;
import p693yu.InterfaceC31084b;
import p716zh.C31933ga;
import vg.C28020b3;

/* renamed from: c30.k */
/* loaded from: classes5.dex */
public class C3249k extends KeyEventCallbackC17462c {

    /* renamed from: c30.k$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        C3249k f13897a;

        /* renamed from: b */
        Context f13898b;

        /* renamed from: c */
        String f13899c;

        /* renamed from: d */
        C3245i f13900d;

        /* renamed from: e */
        InterfaceC31084b.a f13901e;

        /* renamed from: f */
        int f13902f;

        /* renamed from: c30.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        class C32691a implements C19516c.c {
            C32691a() {
            }

            @Override // gn.C19516c.c
            /* renamed from: a */
            public void mo2310a(int i11, C20096c c20096c) {
                ToastUtils.showMess(a.this.f13898b.getString(AbstractC8020f0.error_message));
                C3249k c3249k = a.this.f13897a;
                if (c3249k != null) {
                    c3249k.dismiss();
                }
                InterfaceC31084b.a aVar = a.this.f13901e;
                if (aVar != null) {
                    aVar.mo62989c(c20096c);
                }
            }

            @Override // gn.C19516c.c
            /* renamed from: b */
            public void mo2311b(int i11, ArrayList arrayList) {
                C3249k c3249k;
                try {
                    C28020b3.f130648a.m141184I(arrayList);
                    C31933ga.f146718a.m153476s(a.this.f13900d.f13854b);
                    C28644j.m143233Y().m143292X0();
                    ToastUtils.m89266n(AbstractC8020f0.str_sticker_downloaded, new Object[0]);
                    C3249k c3249k2 = a.this.f13897a;
                    if (c3249k2 != null && c3249k2.m92868m() && (c3249k = a.this.f13897a) != null) {
                        c3249k.dismiss();
                    }
                    InterfaceC31084b.a aVar = a.this.f13901e;
                    if (aVar != null) {
                        aVar.mo62988b();
                    }
                    C28644j.m143233Y().m143292X0();
                    C2834f.f11325a.m13689k();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        public a(Context context, int i11) {
            this.f13898b = context;
            this.f13902f = i11;
        }

        /* renamed from: a */
        public C3249k m16500a() {
            try {
                LayoutInflater layoutInflater = (LayoutInflater) this.f13898b.getSystemService("layout_inflater");
                C3249k c3249k = new C3249k(this.f13898b, AbstractC8915g0.Theme_Dialog_Translucent);
                this.f13897a = c3249k;
                c3249k.m92870v(1);
                this.f13897a.m92851B(layoutInflater.inflate(AbstractC7409c0.sticker_download_dialog, (ViewGroup) null));
                String str = this.f13899c;
                if (str != null && str.length() > 0) {
                    C19515b.m101996i().m102004m(this.f13900d, this.f13902f, new C32691a());
                    InterfaceC31084b.a aVar = this.f13901e;
                    if (aVar != null) {
                        aVar.mo62987a();
                    }
                } else {
                    ToastUtils.showMess(this.f13898b.getString(AbstractC8020f0.error_message));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return this.f13897a;
        }

        /* renamed from: b */
        public a m16501b(String str) {
            this.f13899c = str;
            return this;
        }

        /* renamed from: c */
        public void m16502c(InterfaceC31084b.a aVar) {
            this.f13901e = aVar;
        }

        /* renamed from: d */
        public a m16503d(C3245i c3245i) {
            this.f13900d = c3245i;
            return this;
        }
    }

    public C3249k(Context context, int i11) {
        super(context, i11);
    }
}

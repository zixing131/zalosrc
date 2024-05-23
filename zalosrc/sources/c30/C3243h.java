package c30;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import java.io.File;
import java.util.Objects;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C24002m;
import p471r3.C25630b;
import p485rj.C25810b;
import p611wj.C29058f;
import p716zh.C31902e9;
import th.AbstractC26683d;
import vg.C28020b3;

/* renamed from: c30.h */
/* loaded from: classes5.dex */
public class C3243h extends KeyEventCallbackC17462c {

    /* renamed from: c30.h$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        private final Context f13845a;

        /* renamed from: b */
        private final C29058f f13846b;

        /* renamed from: c */
        private String f13847c;

        /* renamed from: d */
        private StickerView f13848d;

        /* renamed from: e */
        private final C23528a f13849e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c30.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class C32689a extends C24002m {
            C32689a(int i11) {
                super(i11);
            }

            @Override // p379o3.C24002m
            /* renamed from: E1 */
            protected void mo16457E1(String str, InterfaceC3968a interfaceC3968a, File file, C23995f c23995f) {
                if (file != null) {
                    C28020b3.f130648a.m141188Q(str, file.getPath());
                    a.this.m16455e(str, file.getPath());
                }
            }
        }

        public a(Context context, C31902e9 c31902e9) {
            C29058f c29058f;
            if (c31902e9 != null) {
                c29058f = c31902e9.m153316h();
            } else {
                c29058f = null;
            }
            this.f13846b = c29058f;
            this.f13845a = context;
            this.f13849e = new C23528a(context);
        }

        /* renamed from: c */
        private void m16453c() {
            String str;
            try {
                C29058f c29058f = this.f13846b;
                if (c29058f != null) {
                    str = c29058f.m145133e();
                } else {
                    str = "";
                }
                this.f13847c = str;
                if (!TextUtils.isEmpty(str)) {
                    this.f13848d.setThumbUrl(this.f13847c);
                } else {
                    this.f13848d.m56980l();
                    this.f13848d.invalidate();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: d */
        private void m16454d() {
            String str;
            C29058f c29058f = this.f13846b;
            if (c29058f != null && c29058f.m145131c() != null) {
                str = this.f13846b.m145131c().f123105a;
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str) && AbstractC26683d.f126407z) {
                String m141209z = C28020b3.f130648a.m141209z(str);
                if (TextUtils.isEmpty(m141209z)) {
                    ((C23528a) this.f13849e.m123612r(this.f13848d)).m123602g(str, new C32689a(3));
                } else {
                    m16455e(str, m141209z);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m16455e(String str, String str2) {
            C25810b c25810b;
            C29058f c29058f = this.f13846b;
            if (c29058f != null) {
                c25810b = c29058f.m145131c();
            } else {
                c25810b = null;
            }
            if (c25810b != null && Objects.equals(c25810b.f123105a, str)) {
                C25630b c25630b = new C25630b(1, 2);
                c25630b.m132428f0(str);
                c25630b.m132407Q(str2);
                this.f13848d.m56979j(c25630b, c25630b.m132431i(), true, false, false, true);
            }
        }

        /* renamed from: b */
        public C3243h m16456b() {
            View inflate = LayoutInflater.from(this.f13845a).inflate(AbstractC7409c0.chat_photo_sticker_preview, (ViewGroup) null);
            C3243h c3243h = new C3243h(this.f13845a);
            c3243h.m92870v(1);
            c3243h.m92874z(false);
            c3243h.m92852C(inflate, new ViewGroup.LayoutParams(-2, -2));
            this.f13848d = (StickerView) inflate.findViewById(AbstractC6918a0.preview);
            m16453c();
            m16454d();
            return c3243h;
        }
    }

    public C3243h(Context context) {
        super(context);
    }
}

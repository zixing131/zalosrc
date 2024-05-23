package bn;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bn.C2928y1;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import me0.AbstractC23238v2;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;

/* renamed from: bn.y1 */
/* loaded from: classes3.dex */
public class C2928y1 extends KeyEventCallbackC17462c {

    /* renamed from: bn.y1$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        InterfaceC27218a f11575a;

        /* renamed from: b */
        String f11576b;

        /* renamed from: c */
        LinearLayout f11577c;

        /* renamed from: d */
        LinearLayout f11578d;

        /* renamed from: e */
        LinearLayout f11579e;

        /* renamed from: f */
        LinearLayout f11580f;

        /* renamed from: l */
        C2928y1 f11586l;

        /* renamed from: m */
        InterfaceC17463d.d f11587m;

        /* renamed from: n */
        InterfaceC17463d.d f11588n;

        /* renamed from: o */
        InterfaceC17463d.d f11589o;

        /* renamed from: p */
        InterfaceC17463d.d f11590p;

        /* renamed from: g */
        int f11581g = 0;

        /* renamed from: h */
        int f11582h = 0;

        /* renamed from: i */
        int f11583i = -1;

        /* renamed from: j */
        boolean f11584j = false;

        /* renamed from: k */
        boolean f11585k = false;

        /* renamed from: q */
        boolean f11591q = false;

        /* renamed from: r */
        Fragment f11592r = null;

        public a(InterfaceC27218a interfaceC27218a) {
            this.f11575a = interfaceC27218a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m13876f(View view) {
            InterfaceC17463d.d dVar = this.f11590p;
            if (dVar != null) {
                dVar.mo605K8(this.f11586l, -1);
            }
            this.f11586l.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m13877g(View view) {
            InterfaceC17463d.d dVar = this.f11589o;
            if (dVar != null) {
                dVar.mo605K8(this.f11586l, -1);
            }
            this.f11586l.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m13878h(View view) {
            int i11 = this.f11583i;
            if (i11 == 1) {
                AbstractC23647d.m123906p("6420");
            } else if (i11 == 2) {
                AbstractC23647d.m123906p("6320");
            }
            if (AbstractC23238v2.m119727l()) {
                Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                InterfaceC17463d.d dVar = this.f11588n;
                if (dVar != null) {
                    dVar.mo605K8(this.f11586l, -1);
                } else {
                    int i12 = this.f11581g;
                    if (i12 > 0) {
                        Fragment fragment = this.f11592r;
                        if (fragment == null) {
                            this.f11575a.startActivityForResult(intent, i12);
                        } else {
                            fragment.startActivityForResult(intent, i12);
                        }
                    } else {
                        this.f11575a.startActivityForResult(intent, 4);
                    }
                }
            } else {
                ToastUtils.showMess(this.f11575a.getString(AbstractC8020f0.error_sdcard));
            }
            this.f11586l.dismiss();
            AbstractC23647d.m123893c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m13879i(View view) {
            try {
                InterfaceC17463d.d dVar = this.f11587m;
                if (dVar != null) {
                    dVar.mo605K8(this.f11586l, -1);
                }
                this.f11586l.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: e */
        public C2928y1 m13880e() {
            LayoutInflater layoutInflater = (LayoutInflater) this.f11575a.getContext().getSystemService("layout_inflater");
            C2928y1 c2928y1 = new C2928y1(this.f11575a.getContext(), AbstractC8915g0.Theme_Dialog_Translucent);
            this.f11586l = c2928y1;
            c2928y1.m92870v(1);
            View inflate = layoutInflater.inflate(AbstractC7409c0.select_picture_dialog2, (ViewGroup) null);
            this.f11586l.m92859c(inflate, new ViewGroup.LayoutParams(-1, -2));
            ((TextView) inflate.findViewById(AbstractC6918a0.confirm_title)).setText(this.f11576b);
            if (this.f11585k) {
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(AbstractC6918a0.btn_view_cover);
                this.f11580f = linearLayout;
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: bn.u1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C2928y1.a.this.m13876f(view);
                    }
                });
                this.f11580f.setVisibility(0);
            }
            if (this.f11584j) {
                LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(AbstractC6918a0.btn_view_avatar);
                this.f11579e = linearLayout2;
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: bn.v1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C2928y1.a.this.m13877g(view);
                    }
                });
                this.f11579e.setVisibility(0);
            }
            LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(AbstractC6918a0.btn_gallery);
            this.f11577c = linearLayout3;
            linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: bn.w1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2928y1.a.this.m13878h(view);
                }
            });
            LinearLayout linearLayout4 = (LinearLayout) inflate.findViewById(AbstractC6918a0.btn_takeapic);
            this.f11578d = linearLayout4;
            linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: bn.x1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2928y1.a.this.m13879i(view);
                }
            });
            this.f11586l.m92851B(inflate);
            return this.f11586l;
        }

        /* renamed from: j */
        public a m13881j(InterfaceC17463d.d dVar) {
            this.f11588n = dVar;
            return this;
        }

        /* renamed from: k */
        public a m13882k(InterfaceC17463d.d dVar) {
            this.f11587m = dVar;
            return this;
        }

        /* renamed from: l */
        public a m13883l(String str) {
            this.f11576b = str;
            return this;
        }
    }

    public C2928y1(Context context, int i11) {
        super(context, i11);
    }
}

package bn;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.zview.dialog.AbstractC17464e;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;

/* renamed from: bn.l */
/* loaded from: classes3.dex */
public class C2887l extends KeyEventCallbackC17462c {

    /* renamed from: bn.l$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private final Context f11492a;

        /* renamed from: b */
        private String f11493b;

        /* renamed from: c */
        private String f11494c;

        /* renamed from: d */
        private String f11495d;

        /* renamed from: e */
        private String f11496e;

        /* renamed from: f */
        private String f11497f;

        /* renamed from: g */
        InterfaceC17463d.d f11498g;

        /* renamed from: h */
        InterfaceC17463d.d f11499h;

        public a(Context context) {
            this.f11492a = context;
        }

        /* renamed from: a */
        public C2887l m13838a() {
            LayoutInflater layoutInflater = (LayoutInflater) this.f11492a.getSystemService("layout_inflater");
            C2887l c2887l = new C2887l(this.f11492a, AbstractC8915g0.Theme_Dialog_Translucent);
            c2887l.m92870v(1);
            View inflate = layoutInflater.inflate(AbstractC7409c0.confirm_activephone_dialog, (ViewGroup) null);
            c2887l.m92859c(inflate, new ViewGroup.LayoutParams(-1, -2));
            if (!TextUtils.isEmpty(this.f11494c)) {
                ((TextView) inflate.findViewById(AbstractC6918a0.confirm_title)).setText(this.f11494c);
            }
            ((TextView) inflate.findViewById(AbstractC6918a0.phoneNumber)).setText(this.f11493b);
            String str = this.f11495d;
            if (str != null && str.length() > 0) {
                ((TextView) inflate.findViewById(AbstractC6918a0.messageContent)).setText(this.f11495d);
            }
            Button button = (Button) inflate.findViewById(AbstractC6918a0.confirm_btn_yes);
            String str2 = this.f11496e;
            if (str2 != null) {
                button.setText(str2.toUpperCase());
                InterfaceC17463d.d dVar = this.f11498g;
                if (dVar != null) {
                    AbstractC17464e.m92876b(button, c2887l, dVar, -1);
                }
            } else {
                button.setVisibility(8);
            }
            Button button2 = (Button) inflate.findViewById(AbstractC6918a0.confirm_btn_no);
            String str3 = this.f11497f;
            if (str3 != null) {
                button2.setText(str3.toUpperCase());
                InterfaceC17463d.d dVar2 = this.f11499h;
                if (dVar2 != null) {
                    AbstractC17464e.m92876b(button2, c2887l, dVar2, -2);
                }
            } else {
                button2.setVisibility(8);
            }
            c2887l.m92851B(inflate);
            return c2887l;
        }

        /* renamed from: b */
        public a m13839b(String str) {
            this.f11495d = str;
            return this;
        }

        /* renamed from: c */
        public a m13840c(String str, InterfaceC17463d.d dVar) {
            this.f11497f = str;
            this.f11499h = dVar;
            return this;
        }

        /* renamed from: d */
        public a m13841d(String str) {
            this.f11493b = str;
            return this;
        }

        /* renamed from: e */
        public a m13842e(String str, InterfaceC17463d.d dVar) {
            this.f11496e = str;
            this.f11498g = dVar;
            return this;
        }

        /* renamed from: f */
        public a m13843f(String str) {
            this.f11494c = str;
            return this;
        }
    }

    public C2887l(Context context, int i11) {
        super(context, i11);
    }
}

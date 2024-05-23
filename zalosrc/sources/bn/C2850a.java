package bn;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.zview.dialog.AbstractC17464e;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;

/* renamed from: bn.a */
/* loaded from: classes3.dex */
public class C2850a extends KeyEventCallbackC17462c {

    /* renamed from: bn.a$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private ImageView f11345a;

        /* renamed from: b */
        private TextView f11346b;

        /* renamed from: c */
        private Button f11347c;

        /* renamed from: d */
        private Button f11348d;

        /* renamed from: e */
        private final Context f11349e;

        /* renamed from: f */
        private String f11350f;

        /* renamed from: g */
        private int f11351g;

        /* renamed from: h */
        private String f11352h;

        /* renamed from: i */
        InterfaceC17463d.d f11353i;

        /* renamed from: j */
        private String f11354j;

        /* renamed from: k */
        InterfaceC17463d.d f11355k;

        public a(Context context) {
            this.f11349e = context;
        }

        /* renamed from: a */
        public C2850a m13739a() {
            C2850a c2850a = new C2850a(this.f11349e, AbstractC8915g0.Theme_Dialog_Translucent);
            View inflate = LayoutInflater.from(this.f11349e).inflate(AbstractC7409c0.send_message_from_share_success_layout, (ViewGroup) null);
            ImageView imageView = (ImageView) inflate.findViewById(AbstractC6918a0.icon);
            this.f11345a = imageView;
            int i11 = this.f11351g;
            if (i11 > 0) {
                imageView.setImageResource(i11);
                this.f11345a.setVisibility(0);
            }
            this.f11346b = (TextView) inflate.findViewById(AbstractC6918a0.alertTitle);
            if (!TextUtils.isEmpty(this.f11350f)) {
                this.f11346b.setText(this.f11350f);
            }
            this.f11347c = (Button) inflate.findViewById(AbstractC6918a0.confirm_btn_first);
            this.f11348d = (Button) inflate.findViewById(AbstractC6918a0.confirm_btn_second);
            c2850a.m92859c(inflate, new ViewGroup.LayoutParams(-1, -1));
            AbstractC17464e.m92876b(this.f11347c, c2850a, this.f11353i, -1);
            AbstractC17464e.m92876b(this.f11348d, c2850a, this.f11355k, -2);
            c2850a.m92873y(false);
            c2850a.m92874z(false);
            return c2850a;
        }

        /* renamed from: b */
        public a m13740b(int i11, InterfaceC17463d.d dVar) {
            this.f11352h = (String) this.f11349e.getText(i11);
            this.f11353i = dVar;
            return this;
        }

        /* renamed from: c */
        public a m13741c(int i11) {
            this.f11351g = i11;
            return this;
        }

        /* renamed from: d */
        public a m13742d(int i11, InterfaceC17463d.d dVar) {
            this.f11354j = (String) this.f11349e.getText(i11);
            this.f11355k = dVar;
            return this;
        }

        /* renamed from: e */
        public a m13743e(int i11) {
            this.f11350f = (String) this.f11349e.getText(i11);
            return this;
        }
    }

    public C2850a(Context context, int i11) {
        super(context, i11);
    }
}

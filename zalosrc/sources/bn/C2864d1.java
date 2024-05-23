package bn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import bn.C2864d1;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import v20.C27473a;

/* renamed from: bn.d1 */
/* loaded from: classes3.dex */
public class C2864d1 extends KeyEventCallbackC17462c {

    /* renamed from: bn.d1$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private final Context f11419a;

        /* renamed from: b */
        private View f11420b;

        /* renamed from: c */
        private ListView f11421c;

        /* renamed from: d */
        private int f11422d;

        /* renamed from: f */
        private C27473a f11424f;

        /* renamed from: e */
        private int f11423e = -1;

        /* renamed from: g */
        private final boolean f11425g = true;

        public a(Context context) {
            this.f11419a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static /* synthetic */ void m13793c(C2864d1 c2864d1, View view) {
            if (c2864d1 != null) {
                c2864d1.cancel();
            }
        }

        /* renamed from: b */
        public C2864d1 m13794b() {
            View inflate = ((LayoutInflater) this.f11419a.getSystemService("layout_inflater")).inflate(AbstractC7409c0.menu_list_dialog, (ViewGroup) null);
            if (this.f11422d <= 0) {
                this.f11422d = AbstractC8915g0.Theme_Dialog_Translucent;
            }
            final C2864d1 c2864d1 = new C2864d1(this.f11419a, this.f11422d);
            c2864d1.m92870v(1);
            c2864d1.m92859c(inflate, new ViewGroup.LayoutParams(-1, -1));
            try {
                this.f11420b = inflate.findViewById(AbstractC6918a0.dialogContainer);
                if (this.f11423e < 0) {
                    this.f11423e = (int) (this.f11419a.getResources().getDisplayMetrics().density * 5.0f);
                }
                View view = this.f11420b;
                int i11 = this.f11423e;
                view.setPadding(i11, i11, i11, i11);
                this.f11420b.setOnClickListener(new View.OnClickListener() { // from class: bn.c1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C2864d1.a.m13793c(C2864d1.this, view2);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            ListView listView = (ListView) inflate.findViewById(AbstractC6918a0.lvMenu);
            this.f11421c = listView;
            listView.setAdapter((ListAdapter) this.f11424f);
            return c2864d1;
        }

        /* renamed from: d */
        public a m13795d(C27473a c27473a) {
            this.f11424f = c27473a;
            return this;
        }

        /* renamed from: e */
        public a m13796e(AdapterView.OnItemClickListener onItemClickListener) {
            this.f11421c.setOnItemClickListener(onItemClickListener);
            return this;
        }

        /* renamed from: f */
        public a m13797f(int i11) {
            this.f11422d = i11;
            return this;
        }
    }

    public C2864d1(Context context, int i11) {
        super(context, i11);
    }
}

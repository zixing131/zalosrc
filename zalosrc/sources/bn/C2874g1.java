package bn;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bn.C2874g1;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import p542ub.InterfaceC27218a;

/* renamed from: bn.g1 */
/* loaded from: classes3.dex */
public class C2874g1 extends KeyEventCallbackC17462c {

    /* renamed from: bn.g1$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: m */
        private static final int f11437m = AbstractC23136l9.m118742r(20.0f);

        /* renamed from: n */
        private static final int f11438n = AbstractC23136l9.m118742r(24.0f);

        /* renamed from: o */
        private static final int f11439o = AbstractC23136l9.m118742r(12.0f);

        /* renamed from: a */
        InterfaceC27218a f11440a;

        /* renamed from: b */
        String f11441b;

        /* renamed from: c */
        Drawable f11442c;

        /* renamed from: e */
        b f11444e;

        /* renamed from: f */
        C2874g1 f11445f;

        /* renamed from: i */
        ImageView f11448i;

        /* renamed from: j */
        RobotoTextView f11449j;

        /* renamed from: k */
        RecyclerView f11450k;

        /* renamed from: l */
        C2877h1 f11451l;

        /* renamed from: g */
        int f11446g = -1;

        /* renamed from: h */
        int f11447h = f11437m;

        /* renamed from: d */
        List f11443d = new ArrayList();

        public a(InterfaceC27218a interfaceC27218a) {
            this.f11440a = interfaceC27218a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m13804f(int i11) {
            b bVar = this.f11444e;
            if (bVar != null) {
                bVar.mo13802a(i11);
            }
            C2874g1 c2874g1 = this.f11445f;
            if (c2874g1 != null) {
                c2874g1.dismiss();
            }
        }

        /* renamed from: b */
        void m13805b() {
            C2877h1 c2877h1;
            String str;
            ImageView imageView;
            Drawable drawable = this.f11442c;
            if (drawable != null && (imageView = this.f11448i) != null) {
                imageView.setImageDrawable(drawable);
            }
            RobotoTextView robotoTextView = this.f11449j;
            if (robotoTextView != null && (str = this.f11441b) != null) {
                robotoTextView.setText(str);
            }
            List list = this.f11443d;
            if (list != null && (c2877h1 = this.f11451l) != null) {
                c2877h1.m13830O(list);
            }
        }

        /* renamed from: c */
        public C2874g1 m13806c() {
            C2874g1 c2874g1 = new C2874g1(this.f11440a.getContext(), AbstractC8915g0.Theme_Dialog_Translucent);
            this.f11445f = c2874g1;
            c2874g1.m92870v(1);
            View m13807d = m13807d();
            this.f11445f.m92859c(m13807d, new ViewGroup.LayoutParams(this.f11446g, -2));
            m13808e(m13807d);
            m13805b();
            return this.f11445f;
        }

        /* renamed from: d */
        View m13807d() {
            return ((LayoutInflater) this.f11440a.getContext().getSystemService("layout_inflater")).inflate(AbstractC7409c0.profile_action_dialog, (ViewGroup) null);
        }

        /* renamed from: e */
        void m13808e(View view) {
            try {
                this.f11448i = (ImageView) view.findViewById(AbstractC6918a0.dialog_cover);
                RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.dialog_title);
                this.f11449j = robotoTextView;
                int i11 = f11438n;
                robotoTextView.setPadding(i11, this.f11447h, i11, f11439o);
                RecyclerView recyclerView = (RecyclerView) view.findViewById(AbstractC6918a0.dialog_list_action);
                this.f11450k = recyclerView;
                recyclerView.setOverScrollMode(2);
                this.f11450k.setLayoutManager(new LinearLayoutManager(this.f11440a.getContext()));
                C2877h1 c2877h1 = new C2877h1();
                this.f11451l = c2877h1;
                c2877h1.m13831P(new b() { // from class: bn.f1
                    @Override // bn.C2874g1.b
                    /* renamed from: a */
                    public final void mo13802a(int i12) {
                        C2874g1.a.this.m13804f(i12);
                    }
                });
                this.f11450k.setAdapter(this.f11451l);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: g */
        public a m13809g(b bVar) {
            this.f11444e = bVar;
            return this;
        }

        /* renamed from: h */
        public a m13810h(Drawable drawable) {
            this.f11442c = drawable;
            return this;
        }

        /* renamed from: i */
        public a m13811i(List list) {
            if (list != null) {
                this.f11443d = new ArrayList(list);
            }
            return this;
        }

        /* renamed from: j */
        public a m13812j(String str) {
            this.f11441b = str;
            return this;
        }

        /* renamed from: k */
        public a m13813k(int i11) {
            this.f11447h = i11;
            return this;
        }

        /* renamed from: l */
        public a m13814l(int i11) {
            this.f11446g = i11;
            return this;
        }
    }

    /* renamed from: bn.g1$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo13802a(int i11);
    }

    public C2874g1(Context context, int i11) {
        super(context, i11);
    }
}

package v20;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import au.C2343e;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23028c0;
import me0.C23278z2;
import p348mi.C23302b;
import p354n3.C23528a;
import p461qu.AbstractC25495a;

/* renamed from: v20.q */
/* loaded from: classes5.dex */
public class C27489q extends BaseAdapter {

    /* renamed from: p */
    ArrayList f129287p;

    /* renamed from: q */
    public Context f129288q;

    /* renamed from: r */
    public LayoutInflater f129289r;

    /* renamed from: s */
    private final C23528a f129290s;

    /* renamed from: t */
    private final String f129291t;

    /* renamed from: u */
    a f129292u;

    /* renamed from: v */
    private int f129293v;

    /* renamed from: w */
    TrackingSource f129294w;

    /* renamed from: v20.q$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo82873a(LikeContactItem likeContactItem);

        /* renamed from: b */
        void mo82874b(LikeContactItem likeContactItem, TrackingSource trackingSource);
    }

    /* renamed from: v20.q$b */
    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a */
        public RecyclingImageView f129295a;

        /* renamed from: b */
        public TextView f129296b;

        /* renamed from: c */
        public LinearLayout f129297c;

        /* renamed from: d */
        public View f129298d;
    }

    public C27489q(int i11, Context context, String str, a aVar, TrackingSource trackingSource) {
        this.f129288q = context;
        this.f129290s = new C23528a(context);
        this.f129289r = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f129291t = str;
        this.f129292u = aVar;
        this.f129293v = i11;
        this.f129294w = trackingSource;
    }

    /* renamed from: c */
    private void m140579c(b bVar, final LikeContactItem likeContactItem) {
        bVar.f129297c.setOnClickListener(new View.OnClickListener() { // from class: v20.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C27489q.this.m140580e(likeContactItem, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m140580e(LikeContactItem likeContactItem, View view) {
        this.f129292u.mo82874b(likeContactItem, this.f129294w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m140581f(LikeContactItem likeContactItem, View view) {
        try {
            a aVar = this.f129292u;
            if (aVar != null && likeContactItem != null) {
                aVar.mo82873a(likeContactItem);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public ArrayList m140582d() {
        return this.f129287p;
    }

    /* renamed from: g */
    public void m140583g(String str) {
        ArrayList arrayList;
        if (!TextUtils.isEmpty(str) && (arrayList = this.f129287p) != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LikeContactItem likeContactItem = (LikeContactItem) it.next();
                    if (likeContactItem != null && likeContactItem.m56333d().equals(str)) {
                        it.remove();
                        notifyDataSetChanged();
                        return;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f129287p;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f129287p.get(i11);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        View view2;
        b bVar;
        if (view == null) {
            bVar = new b();
            view2 = this.f129289r.inflate(AbstractC7409c0.tagcontact_row, (ViewGroup) null);
            bVar.f129295a = (RecyclingImageView) view2.findViewById(AbstractC6918a0.likeContactAvatar);
            bVar.f129296b = (TextView) view2.findViewById(AbstractC6918a0.likeContactName);
            bVar.f129297c = (LinearLayout) view2.findViewById(AbstractC6918a0.info_contact_row);
            bVar.f129298d = view2.findViewById(AbstractC6918a0.remove_tag_button);
            view2.setTag(bVar);
        } else {
            view2 = view;
            bVar = (b) view.getTag();
        }
        final LikeContactItem likeContactItem = (LikeContactItem) this.f129287p.get(i11);
        bVar.f129295a.setImageResource(AbstractC16803z.default_avatar);
        if (likeContactItem.m56330a() != null) {
            if (C23302b.f113247a.m120523d(likeContactItem.m56330a()) && !CoreUtility.f89233i.equals(likeContactItem.m56333d())) {
                int m12307a = C2343e.m12307a(likeContactItem.m56333d(), false);
                bVar.f129295a.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(likeContactItem.m56331b()), m12307a));
            } else {
                ((C23528a) this.f129290s.m123612r(bVar.f129295a)).m123618x(likeContactItem.m56330a(), C23278z2.m120143n());
            }
        }
        bVar.f129296b.setText(likeContactItem.m56331b());
        int i12 = this.f129293v;
        if (i12 != 4 && i12 != 5) {
            m140579c(bVar, likeContactItem);
        }
        int i13 = this.f129293v;
        if (i13 != 3 && i13 != 5) {
            if (likeContactItem.m56333d().equals(CoreUtility.f89233i)) {
                bVar.f129298d.setVisibility(0);
            } else if (!AbstractC25495a.m132077b(likeContactItem.m56333d()) && !likeContactItem.m56333d().equals("-1")) {
                if (this.f129291t.equals(CoreUtility.f89233i)) {
                    bVar.f129298d.setVisibility(0);
                } else {
                    bVar.f129298d.setVisibility(8);
                }
            } else {
                bVar.f129298d.setVisibility(8);
            }
        } else {
            bVar.f129298d.setVisibility(8);
        }
        bVar.f129298d.setOnClickListener(new View.OnClickListener() { // from class: v20.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C27489q.this.m140581f(likeContactItem, view3);
            }
        });
        return view2;
    }

    /* renamed from: h */
    public void m140584h(ArrayList arrayList) {
        this.f129287p = new ArrayList(arrayList);
    }
}

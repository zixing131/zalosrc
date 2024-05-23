package pa0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.settings.subsettings.BlockContactsView;
import com.zing.zalo.p077ui.settings.widget.ItemContactView;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.avatar.C16948d;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import me0.C23212s8;

/* renamed from: pa0.a */
/* loaded from: classes6.dex */
public class C24708a extends BaseAdapter {

    /* renamed from: p */
    ArrayList f118673p;

    /* renamed from: q */
    private final long f118674q = 0;

    /* renamed from: r */
    public boolean f118675r = false;

    /* renamed from: s */
    private final View.OnClickListener f118676s;

    /* renamed from: t */
    private final BlockContactsView.EnumC13257h f118677t;

    public C24708a(BlockContactsView.EnumC13257h enumC13257h, ArrayList arrayList, View.OnClickListener onClickListener) {
        this.f118673p = new ArrayList(arrayList);
        this.f118676s = onClickListener;
        this.f118677t = enumC13257h;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public ContactProfile getItem(int i11) {
        return (ContactProfile) this.f118673p.get(i11);
    }

    /* renamed from: b */
    public void m128293b(ArrayList arrayList) {
        this.f118673p = new ArrayList(arrayList);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f118673p.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        View view2;
        ItemContactView itemContactView;
        boolean z11;
        if (view == null) {
            itemContactView = new ItemContactView(viewGroup.getContext());
            itemContactView.setIdTracking("ITEM_BLOCK_LIST");
            itemContactView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            view2 = itemContactView;
        } else {
            view2 = view;
            itemContactView = (ItemContactView) view;
        }
        Avatar avatar = itemContactView.f68291G;
        avatar.setImageDrawable(C23212s8.m119609q(avatar.getContext(), AbstractC16781w.default_avatar));
        try {
            ContactProfile contactProfile = (ContactProfile) this.f118673p.get(i11);
            if (i11 < this.f118673p.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            itemContactView.m90592m(z11);
            if (this.f118677t == BlockContactsView.EnumC13257h.ZALO_FRIEND) {
                itemContactView.f68292H.setText(MainApplication.getAppContext().getString(AbstractC8020f0.game_manage_block_apps_item_button_do_unblock));
            } else {
                itemContactView.f68292H.setText(MainApplication.getAppContext().getString(AbstractC8020f0.str_group_unblock_member));
            }
            itemContactView.f68292H.setTag(Integer.valueOf(i11));
            itemContactView.f68292H.setOnClickListener(this.f118676s);
            String m40383Q = contactProfile.m40383Q(true, false);
            itemContactView.setTitle(m40383Q);
            itemContactView.f68291G.setScrollingMode(this.f118675r);
            itemContactView.f68291G.m90478m(new C16948d(1, contactProfile.f42434r, m40383Q, contactProfile.f42446v));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return view2;
    }
}

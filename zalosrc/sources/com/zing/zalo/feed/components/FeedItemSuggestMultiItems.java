package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import bo.C3000l0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.social.controls.InterfaceC10867f;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import p615wn.C29106b;
import p615wn.C29108d;

/* loaded from: classes4.dex */
public class FeedItemSuggestMultiItems extends FeedItemSuggestMultiBase {

    /* renamed from: l1 */
    private static final int f44811l1 = AbstractC23136l9.m118722k0();

    /* renamed from: c1 */
    public int f44812c1;

    /* renamed from: d1 */
    public int f44813d1;

    /* renamed from: e1 */
    public int f44814e1;

    /* renamed from: f1 */
    public int f44815f1;

    /* renamed from: g1 */
    public float f44816g1;

    /* renamed from: h1 */
    public int f44817h1;

    /* renamed from: i1 */
    private FeedItemSuggestHeader f44818i1;

    /* renamed from: j1 */
    private View.OnClickListener f44819j1;

    /* renamed from: k1 */
    private View.OnClickListener f44820k1;

    public FeedItemSuggestMultiItems(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44812c1 = 0;
        this.f44813d1 = 0;
        this.f44814e1 = 0;
        this.f44815f1 = 0;
        this.f44816g1 = 0.0f;
        this.f44817h1 = 3;
    }

    /* renamed from: Q */
    public void m44145Q(C3000l0 c3000l0, boolean z11, Context context, InterfaceC10867f interfaceC10867f) {
        try {
            FeedItemSuggestHeader feedItemSuggestHeader = this.f44818i1;
            if (feedItemSuggestHeader != null) {
                feedItemSuggestHeader.m44137b(c3000l0, 0, z11, interfaceC10867f);
                this.f44818i1.m44138c(context, c3000l0, 0, interfaceC10867f);
                this.f44818i1.setOnProfileClickListener(this.f44819j1);
                this.f44818i1.setOnSuggestLocationClickListener(this.f44820k1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    public List<Integer> getArrIdsListCallback() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(11);
        return arrayList;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: j */
    public void mo43686j(C29106b c29106b) {
        if (c29106b instanceof C29108d) {
            setFeedContent(c29106b.f134937a);
            m44145Q(c29106b.f134937a, c29106b.f134940d, c29106b.f134939c, c29106b.f134942f);
            C29108d c29108d = (C29108d) c29106b;
            int i11 = c29108d.f134949k;
            m44141P(c29106b.f134939c, c29106b.f134937a, c29106b.f134940d, null, i11, c29106b.f134941e);
            getPager().addOnPageChangeListener(c29108d.f134950l);
            getPager().setCurrentItem(i11);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemSuggestMultiBase, com.zing.zalo.feed.components.FeedItemSuggestBase, com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: p */
    public void mo43688p(Context context, int i11) {
        try {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            this.f44812c1 = context.getResources().getDimensionPixelOffset(AbstractC16802y.feed_group_horizontal_padding_left);
            int m118712h = AbstractC23136l9.m118712h(context, 240.0f);
            this.f44813d1 = m118712h;
            int i12 = f44811l1;
            int i13 = (i12 - m118712h) / 2;
            this.f44814e1 = i13;
            this.f44815f1 = (i13 * 2) - AbstractC23136l9.m118712h(context, 5.0f);
            this.f44816g1 = (((this.f44813d1 + this.f44814e1) + this.f44812c1) * 1.0f) / i12;
            if (i11 == 4) {
                layoutInflater.inflate(AbstractC7409c0.feed_item_suggest_multi_items_detail, this);
                FeedItemSuggestHeader feedItemSuggestHeader = (FeedItemSuggestHeader) findViewById(AbstractC6918a0.feedItemSuggestHeader);
                this.f44818i1 = feedItemSuggestHeader;
                feedItemSuggestHeader.m44136a(context, 4);
            } else {
                layoutInflater.inflate(AbstractC7409c0.feed_item_suggest_multi_items_content, this);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo43688p(context, i11);
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    public void setListListener(SparseArray<View.OnClickListener> sparseArray) {
        setOnProfileClickListenner(sparseArray.get(10));
        setOnLocationClickListener(sparseArray.get(11));
    }

    public void setOnLocationClickListener(View.OnClickListener onClickListener) {
        this.f44820k1 = onClickListener;
    }

    public void setOnProfileClickListenner(View.OnClickListener onClickListener) {
        this.f44819j1 = onClickListener;
    }
}

package p311l1;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: l1.c */
/* loaded from: classes2.dex */
public abstract class AbstractC21997c extends AbstractC21995a {

    /* renamed from: x */
    private int f108363x;

    /* renamed from: y */
    private int f108364y;

    /* renamed from: z */
    private LayoutInflater f108365z;

    public AbstractC21997c(Context context, int i11, Cursor cursor, boolean z11) {
        super(context, cursor, z11);
        this.f108364y = i11;
        this.f108363x = i11;
        this.f108365z = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p311l1.AbstractC21995a
    /* renamed from: g */
    public View mo114871g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f108365z.inflate(this.f108364y, viewGroup, false);
    }

    @Override // p311l1.AbstractC21995a
    /* renamed from: h */
    public View mo5672h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f108365z.inflate(this.f108363x, viewGroup, false);
    }
}

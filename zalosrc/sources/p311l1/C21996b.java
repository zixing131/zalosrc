package p311l1;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: l1.b */
/* loaded from: classes2.dex */
class C21996b extends Filter {

    /* renamed from: a */
    a f108362a;

    /* renamed from: l1.b$a */
    /* loaded from: classes2.dex */
    interface a {
        /* renamed from: a */
        void mo5668a(Cursor cursor);

        /* renamed from: b */
        CharSequence mo5669b(Cursor cursor);

        /* renamed from: c */
        Cursor mo5670c(CharSequence charSequence);

        /* renamed from: d */
        Cursor mo114869d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C21996b(a aVar) {
        this.f108362a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f108362a.mo5669b((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo5670c = this.f108362a.mo5670c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo5670c != null) {
            filterResults.count = mo5670c.getCount();
            filterResults.values = mo5670c;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo114869d = this.f108362a.mo114869d();
        Object obj = filterResults.values;
        if (obj != null && obj != mo114869d) {
            this.f108362a.mo5668a((Cursor) obj);
        }
    }
}

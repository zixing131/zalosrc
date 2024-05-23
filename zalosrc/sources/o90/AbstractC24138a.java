package o90;

import com.zing.zalo.data.mediapicker.model.FolderItem;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: o90.a */
/* loaded from: classes6.dex */
public abstract class AbstractC24138a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o90.a$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f116668t;

        /* renamed from: u */
        final /* synthetic */ List f116669u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, Continuation continuation) {
            super(2, continuation);
            this.f116669u = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f116669u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f116668t == 0) {
                AbstractC24862s.m129228b(obj);
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = this.f116669u.size();
                for (int i11 = 0; i11 < size; i11++) {
                    FolderItem folderItem = new FolderItem();
                    folderItem.m41096C0(((FolderItem) this.f116669u.get(i11)).m41170t());
                    folderItem.m41098D0(((FolderItem) this.f116669u.get(i11)).m41172u());
                    folderItem.m41107J0(((FolderItem) this.f116669u.get(i11)).m41097D());
                    ArrayList arrayList2 = new ArrayList();
                    for (MediaItem mediaItem : ((FolderItem) this.f116669u.get(i11)).m41086t1()) {
                        if (linkedHashMap.containsKey(mediaItem) && linkedHashMap.get(mediaItem) != null) {
                            Object obj2 = linkedHashMap.get(mediaItem);
                            AbstractC19074t.m100205c(obj2);
                            arrayList2.add(obj2);
                        } else if (mediaItem instanceof VideoItem) {
                            VideoItem videoItem = new VideoItem((VideoItem) mediaItem);
                            arrayList2.add(videoItem);
                            linkedHashMap.put(mediaItem, videoItem);
                        } else {
                            MediaItem mediaItem2 = new MediaItem(mediaItem);
                            arrayList2.add(mediaItem2);
                            linkedHashMap.put(mediaItem, mediaItem2);
                        }
                    }
                    folderItem.m41089w1(arrayList2);
                    arrayList.add(folderItem);
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: a */
    public static final Object m126111a(CoroutineDispatcher coroutineDispatcher, List list, Continuation continuation) {
        return BuildersKt.m112534g(coroutineDispatcher, new a(list, null), continuation);
    }

    /* renamed from: b */
    public static final List m126112b(List list) {
        AbstractC19074t.m100208f(list, "mediaItems");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaItem mediaItem = (MediaItem) it.next();
            if (mediaItem instanceof VideoItem) {
                arrayList.add(new VideoItem((VideoItem) mediaItem));
            } else {
                arrayList.add(new MediaItem(mediaItem));
            }
        }
        return arrayList;
    }
}

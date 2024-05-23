package i60;

import android.content.Intent;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: i60.l */
/* loaded from: classes5.dex */
public final class C20346l {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final MessageId f100342a;

    /* renamed from: i60.l$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20346l m106078a(Intent intent) {
            if (intent != null) {
                return new C20346l((MessageId) intent.getParcelableExtra("extra_msg_id"));
            }
            return null;
        }
    }

    public C20346l(MessageId messageId) {
        this.f100342a = messageId;
    }

    /* renamed from: a */
    public static final C20346l m106076a(Intent intent) {
        return Companion.m106078a(intent);
    }

    /* renamed from: b */
    public final MessageId m106077b() {
        return this.f100342a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20346l) && AbstractC19074t.m100204b(this.f100342a, ((C20346l) obj).f100342a);
    }

    public int hashCode() {
        MessageId messageId = this.f100342a;
        if (messageId == null) {
            return 0;
        }
        return messageId.hashCode();
    }

    public String toString() {
        return "OpenGroupBoardViewResult(messageId=" + this.f100342a + ")";
    }
}

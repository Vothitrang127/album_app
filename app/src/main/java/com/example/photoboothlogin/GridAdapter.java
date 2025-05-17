import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {
    private List<String> items;

    // Constructor nhận dữ liệu
    public GridAdapter(List<String> items) {
        this.items = items;
    }

    // Tạo ViewHolder (khung chứa layout item)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_grid, parent, false); // Load layout item_grid.xml
        return new ViewHolder(view);
    }

    // Gán dữ liệu vào ViewHolder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String item = items.get(position);
        holder.tvTitle.setText("Title " + position); // Ví dụ: Title 1, Title 2...
        holder.tvSubtitle.setText("Subtitle " + position);
    }

    // Số lượng item trong danh sách
    @Override
    public int getItemCount() {
        return items.size();
    }

    // Lớp ViewHolder để ánh xạ các thành phần UI
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvSubtitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle); // Ánh xạ từ item_grid.xml
            tvSubtitle = itemView.findViewById(R.id.tvSubtitle);
        }
    }
}
package me.example.demo.playlists;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SearchPlaylist {
	Integer userId;
	@Getter(AccessLevel.NONE)
	Integer page;
	Integer perPage;

	public Integer getPage() {
		return page - 1;
	}
}
